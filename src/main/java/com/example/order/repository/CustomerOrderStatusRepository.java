package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.entity.CustomerOrderStatus;

@Repository
public interface CustomerOrderStatusRepository extends JpaRepository<CustomerOrderStatus, Long> {

	
}
