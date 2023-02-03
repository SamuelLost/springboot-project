package com.educandoweb.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
