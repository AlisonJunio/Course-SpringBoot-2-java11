package com.alisonlima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisonlima.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
