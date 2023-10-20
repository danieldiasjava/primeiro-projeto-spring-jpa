package com.primeiroprojetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetospring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
