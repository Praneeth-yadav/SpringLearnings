package com.ep.interfaceimpl;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements Dao {

	@Override
	public void placeorder() {
		System.out.println("Inside Dao imple 2");
	}

}
