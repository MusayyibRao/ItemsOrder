package com.example.crudOperation.service;

import java.util.List;



import com.example.crudOperation.entity.OrderEntity;



public interface OrderService {
	

public List<OrderEntity> saveAll(List<OrderEntity> entites);

OrderEntity saveOrder(OrderEntity order);

List<OrderEntity> getOrder();
	
OrderEntity getOrderData(Long orderId);
}
