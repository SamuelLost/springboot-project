package com.educandoweb.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
