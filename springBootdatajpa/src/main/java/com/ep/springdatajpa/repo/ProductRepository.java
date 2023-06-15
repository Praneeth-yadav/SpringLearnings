package com.ep.springdatajpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.ep.springdatajpa.entities.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

List<Product> findByName(String name);
}
