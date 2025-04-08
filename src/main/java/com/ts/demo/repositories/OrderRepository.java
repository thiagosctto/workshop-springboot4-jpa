package com.ts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{ 
	
}
