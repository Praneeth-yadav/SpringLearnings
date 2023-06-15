package com.ep.spring.springorm.product.dao.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ep.spring.springorm.entity.Product;
import com.ep.spring.springorm.product.dao.ProductDao;

@Component("productdaoimpl")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private
	HibernateTemplate hibernatetemplate;

	@Override
	@Transactional
	public int create(Product product) {
		int res = (Integer) getHibernatetemplate().save(product);
		return res;
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

}
