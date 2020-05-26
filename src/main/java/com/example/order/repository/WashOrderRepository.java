package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.entity.WashOrder;

@Repository
public interface WashOrderRepository extends JpaRepository<WashOrder, Long> {

	
}
