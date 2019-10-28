package com.example.feign_orders_consumer.service;

import com.example.feign_orders_consumer.pojo.Orders;


import java.util.List;

public interface ConsumerService {
    Orders getOrder(Integer id);

    List<Orders> getOrders();
}
