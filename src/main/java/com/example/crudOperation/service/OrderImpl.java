package com.example.crudOperation.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.crudOperation.entity.OrderEntity;
import com.example.crudOperation.repository.OrderRepo;

@Service
public class OrderImpl implements OrderService{

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public OrderEntity saveOrder(OrderEntity order) {
			return orderRepo.save(order);
	}

	@Override
	public List<OrderEntity> getOrder() {
		
		return orderRepo.findAll();
	}

	@Override
	public OrderEntity getOrderData(Long orderId) {
		return orderRepo.findById(orderId).get();
	}
	

	@Override
	public  List<OrderEntity> saveAll(List<OrderEntity> entites) {
	
		return orderRepo.saveAll(entites);
	}

}
