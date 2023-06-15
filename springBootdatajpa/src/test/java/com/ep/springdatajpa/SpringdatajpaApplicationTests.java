package com.ep.springdatajpa;

import com.ep.springdatajpa.entities.Product;
import com.ep.springdatajpa.repo.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {

		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1);
		product.setDescription("sfdfd");
		product.setName("rice");
		product.setPrice(1000);
		repository.save(product);
		Optional<Product> res = repository.findById(1);
		if (res.isPresent()) {
			System.out.println(res);
			product.setPrice(2000);
			repository.save(product);
			repository.findAll().forEach(product1 -> {
				System.out.println(product1.getPrice());

			});

			System.out.println(repository.findByName("rice"));

		}

	}
}
