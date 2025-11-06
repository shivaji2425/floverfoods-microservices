package com.microservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
