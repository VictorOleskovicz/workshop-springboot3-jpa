package com.projetoedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoedu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
