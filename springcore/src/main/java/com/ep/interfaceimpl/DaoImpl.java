package com.ep.interfaceimpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Dao {

	@Override
	public void placeorder() {
		System.out.println("Inside Dao");
	}

}
