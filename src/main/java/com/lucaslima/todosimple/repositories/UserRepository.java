package com.lucaslima.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaslima.todosimple.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
 }
