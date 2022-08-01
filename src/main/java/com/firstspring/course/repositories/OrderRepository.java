package com.firstspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
