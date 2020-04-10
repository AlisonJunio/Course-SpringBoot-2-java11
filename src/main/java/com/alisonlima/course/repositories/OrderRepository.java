package com.alisonlima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisonlima.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
