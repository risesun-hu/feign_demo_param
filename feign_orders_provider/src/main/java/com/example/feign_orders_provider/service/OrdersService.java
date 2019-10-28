
package com.example.feign_orders_provider.service;

import java.util.List;


import com.example.feign_orders_provider.pojo.Orders;

public interface OrdersService {

	/***
	 * 实现某个订单信息的查询
	 */
	public Orders loadOrdersService(Integer id);
	
	/***
	 * 查询所有订单的集合
	 */
	public List<Orders> loadOrdersListService();
}
