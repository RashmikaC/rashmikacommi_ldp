package com.example.spring_assignment.service;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAll();

    public Customer getCustomer(int id);

    public void saveCustomer(CustomerDTO customerDTO);

    public void deleteCustomer(int id);

    public List<CustomerOrder> getOrdersOfCustomerId(int id);
}
