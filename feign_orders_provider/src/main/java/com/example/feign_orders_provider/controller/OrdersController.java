package com.example.feign_orders_provider.controller;

import java.util.List;

import com.example.feign_orders_provider.pojo.Orders;
import com.example.feign_orders_provider.pojo.Users;
import com.example.feign_orders_provider.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	/***
	 * 处理加载订单详细信息的请求
	 */
	@GetMapping("/params")
	public String getParam(@RequestParam("param") String param){
		return "get,url传参："+param;
	}

	@GetMapping("/params/{param}")
	public String getParam2(@PathVariable("param") String param){
		return "get,rest传参："+param;
	}

	@PostMapping("/params")
	public String PostParam(@RequestParam("param") String param){
		return "post,表单传参："+param;
	}

	@PostMapping("/params/{param}")
	public String PostParam2(@PathVariable("param") String param){
		return "post,rest传参："+param;
	}

	@GetMapping("/mparams")
	public Users getUsers(Users users){
		System.out.println("get多参");
        System.out.println(users.getId()+users.getName()+users.getAddress());
		return users;
	}

	//Post请求需要加RequestBody来获得请求体的数据
	@PostMapping("/mparams")
	public Users postUsers(@RequestBody Users users){
		System.out.println("post多参");
		return users;
	}
}
