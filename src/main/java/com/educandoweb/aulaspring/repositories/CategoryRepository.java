package com.educandoweb.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
