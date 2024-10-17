package com.example.demo_bancaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_bancaria.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
