package com.example.feign_orders_provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.feign_orders_provider.pojo.Orders;
import com.example.feign_orders_provider.service.OrdersService;
import org.springframework.stereotype.Service;



@Service
public class OrdersServiceImpl implements OrdersService {

	@Override
	public Orders loadOrdersService(Integer id) {
		// TODO Auto-generated method stub
		Orders orders=new Orders();
		orders.setId(id);
		orders.setRemark("周末配送....8080");
		orders.setTotal(110);
		return orders;
	}

	@Override
	public List<Orders> loadOrdersListService() {
		// TODO Auto-generated method stub
		List<Orders> result=new ArrayList<Orders>();
		
		Orders orders1=new Orders();
		orders1.setId(111);
		orders1.setRemark("周末配送....8070");
		orders1.setTotal(110);
		
		Orders orders=new Orders();
		orders.setId(222);
		orders.setRemark("美女配送....8070");
		orders.setTotal(678);
		
		result.add(orders1);
		result.add(orders);
		
		
		return result;
	}

}
