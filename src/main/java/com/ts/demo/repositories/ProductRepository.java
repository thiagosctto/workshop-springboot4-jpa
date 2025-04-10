package com.ts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ 
	
}
