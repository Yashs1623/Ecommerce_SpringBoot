package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
