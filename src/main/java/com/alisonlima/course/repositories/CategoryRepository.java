package com.alisonlima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alisonlima.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
