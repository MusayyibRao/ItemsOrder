package com.example.crudOperation.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class OrderEntity {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long order_Id;	

//@DateTimeFormat(pattern = "dd/MM/yyyy")
//private Date date;

private String orderStatus="new";

private Date orderDate;



@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "order_id",referencedColumnName = "order_Id")
private List<Items> items;



public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public Long getOrder_Id() {
	return order_Id;
}

public void setOrder_Id(Long order_Id) {
	this.order_Id = order_Id;
}




public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}

public List<Items> getItems() {
	return items;
}

public void setItems(List<Items> items) {
	this.items = items;
}

public OrderEntity(Long order_Id, Date orderDate, String orderStatus, List<Items> items) {
	super();
	this.order_Id = order_Id;
	this.orderDate = orderDate;
	this.orderStatus = orderStatus;
	this.items = items;
}

public OrderEntity() {
	super();
	// TODO Auto-generated constructor stub
}







}
