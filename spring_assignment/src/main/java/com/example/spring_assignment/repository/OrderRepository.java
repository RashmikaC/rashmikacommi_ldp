package com.example.spring_assignment.repository;

import com.example.spring_assignment.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {
}
