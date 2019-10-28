package com.example.feign_orders_consumer.controller;

import com.example.feign_orders_consumer.feign.FeignOrderProvider;
import com.example.feign_orders_consumer.pojo.Orders;
import com.example.feign_orders_consumer.pojo.Users;
import com.example.feign_orders_consumer.service.ConsumerService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private FeignOrderProvider feignOrderProvider;

    @GetMapping("/gparams")
    public String getParam(@RequestParam("param") String param){
        return feignOrderProvider.getParam(param);
    }

    @GetMapping("/gparams/{param}")
    public String getParam2(@PathVariable("param") String param){
        return feignOrderProvider.getParam2(param);
    }

    @PostMapping("/pparams")
    public String PostParam(@RequestParam("param") String param){
        return feignOrderProvider.PostParam(param);
    }

    @PostMapping("/pparams/{param}")
    public String PostParam2(@PathVariable("param") String param){
        return feignOrderProvider.PostParam2(param);
    }

    @GetMapping("/cmparams")
    public Users cmParam(Users users){
        System.out.println(users.getId()+users.getName()+users.getAddress());
        return feignOrderProvider.getUsers(users.getId(),users.getName(),users.getAddress());
    }

    @PostMapping("/pmparams")
    public Users pmParam(Users users){
        System.out.println(users.getId()+users.getName()+users.getAddress());
        return feignOrderProvider.postUsers(users);
    }

}
