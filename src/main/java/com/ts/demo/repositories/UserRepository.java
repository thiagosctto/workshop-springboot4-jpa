package com.ts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
