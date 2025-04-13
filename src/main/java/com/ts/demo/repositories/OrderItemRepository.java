package com.ts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.demo.entities.OrderItem;		

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{ 
	
}
