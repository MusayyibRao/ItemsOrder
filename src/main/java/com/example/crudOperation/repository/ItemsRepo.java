package com.example.crudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudOperation.entity.Items;

@Repository
public interface ItemsRepo extends JpaRepository<Items,Long>{

}
