package com.example.spring_assignment.service;

import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.CustomerOrder;

import java.util.List;

public interface OrderService {
    public List<CustomerOrder> findAll();

    public CustomerOrder getOrder(int id);

    public void saveOrder(CustomerOrderDTO customerOrderDTO, int id);

    public void deleteOrder(int id);

}
