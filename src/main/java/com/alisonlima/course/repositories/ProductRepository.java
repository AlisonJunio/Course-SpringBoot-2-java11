package com.alisonlima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisonlima.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
