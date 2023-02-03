package com.educandoweb.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
