package com.primeiroprojetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetospring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
