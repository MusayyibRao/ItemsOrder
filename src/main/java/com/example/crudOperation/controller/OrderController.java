package com.example.crudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudOperation.entity.OrderEntity;
import com.example.crudOperation.service.OrderImpl;

@RestController
public class OrderController {

	
@Autowired	
OrderImpl orderser;	


@PostMapping("/saveOrder")
public OrderEntity addOrderData(@RequestBody OrderEntity order)

{
	return orderser.saveOrder(order);

}

@PostMapping("/saveData")
public List<OrderEntity> saveAllOrder(@RequestBody List<OrderEntity> entites)
{
	
return orderser.saveAll(entites);
}


@GetMapping("/getOrder")

public List<OrderEntity> getData()
{
	return orderser.getOrder();
	
	}


@GetMapping("/getOrder/{id}")
public OrderEntity getOrderData(@PathVariable("id") Long orderId)
{
   return orderser.getOrderData(orderId);	
}

}
