package com.primeiroprojetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetospring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
