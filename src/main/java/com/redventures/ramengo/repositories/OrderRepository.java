package com.redventures.ramengo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redventures.ramengo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
