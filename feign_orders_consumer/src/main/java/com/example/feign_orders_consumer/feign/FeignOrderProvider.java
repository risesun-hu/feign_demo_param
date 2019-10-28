package com.example.feign_orders_consumer.feign;


import com.example.feign_orders_consumer.pojo.Orders;
import com.example.feign_orders_consumer.pojo.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "param-provider")
public interface FeignOrderProvider {

    @GetMapping("/params")
    public String getParam(@RequestParam("param") String param);

    @GetMapping("/params/{param}")
    public String getParam2(@PathVariable("param") String param);

    @PostMapping("/params")
    public String PostParam(@RequestParam("param") String param);

    @PostMapping("/params/{param}")
    public String PostParam2(@PathVariable("param") String param);

    @GetMapping("/mparams")
    public Users getUsers(Users users);

    //Get请求，Feign不能接收Json字符串，所以需要把对象中的数据拆分传递
    @GetMapping("/mparams")
    public Users getUsers(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("address") String address);

    //Post请求，在Feign和Provider都需要加RequestBody来获得请求体的数据
    @PostMapping("/mparams")
    public Users postUsers(@RequestBody Users users);

}
