package com.primeiroprojetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetospring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
