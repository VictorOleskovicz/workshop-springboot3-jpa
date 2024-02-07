package com.projetoedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoedu.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
