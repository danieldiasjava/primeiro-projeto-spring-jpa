package com.primeiroprojetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
