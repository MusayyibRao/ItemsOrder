package com.example.crudOperation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudOperation.entity.OrderEntity;

@Repository
public interface OrderRepo  extends JpaRepository<OrderEntity, Long>{
   
//	List<OrderEntity> saveAll(List<OrderEntity> entites);
	
	
}
