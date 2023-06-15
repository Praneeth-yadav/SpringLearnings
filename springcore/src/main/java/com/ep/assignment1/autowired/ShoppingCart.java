package com.ep.assignment1.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShoppingCart {
	
	@Autowired(required=false)
	@Qualifier("items21")
private Items item;


public Items getItem() {
	return item;
}

public void setItem(Items item) {
	this.item = item;
}

@Override
public String toString() {
	return "ShoppingCart [item=" + item + "]";
}



}
