package com.educandoweb.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
