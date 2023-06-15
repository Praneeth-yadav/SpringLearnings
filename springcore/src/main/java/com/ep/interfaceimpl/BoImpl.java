package com.ep.interfaceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("bo")
public class BoImpl implements Bo {
	
	@Autowired
	@Qualifier("dao2")
	Dao dao;
	@Override
	public void createorder() {
		System.out.println("inside BO");
		dao.placeorder();

	}

}
