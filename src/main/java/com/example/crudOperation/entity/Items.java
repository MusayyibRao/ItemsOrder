package com.example.crudOperation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long itemsId;	

private String itemName;

private String itemUnitPrice;

private Long itemQuantity;

public Long getItemsId() {
	return itemsId;
}

public void setItemsId(Long itemsId) {
	this.itemsId = itemsId;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public String getItemUnitPrice() {
	return itemUnitPrice;
}

public void setItemUnitPrice(String itemUnitPrice) {
	this.itemUnitPrice = itemUnitPrice;
}

public Long getItemQuantity() {
	return itemQuantity;
}

public void setItemQuantity(Long itemQuantity) {
	this.itemQuantity = itemQuantity;
}

public Items(Long itemsId, String itemName, String itemUnitPrice, Long itemQuantity) {
	super();
	this.itemsId = itemsId;
	this.itemName = itemName;
	this.itemUnitPrice = itemUnitPrice;
	this.itemQuantity = itemQuantity;
}

@Override
public String toString() {
	return "Items [itemsId=" + itemsId + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
			+ ", itemQuantity=" + itemQuantity + "]";
}

public Items() {
	super();
	// TODO Auto-generated constructor stub
}




}
