package com.ep.assignment1;


public class ShoppingCart {
	
Items item;

public ShoppingCart(Items item) {
	this.item=item;

}

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
