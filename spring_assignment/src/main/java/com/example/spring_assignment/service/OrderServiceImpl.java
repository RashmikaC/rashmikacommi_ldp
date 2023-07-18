package com.example.spring_assignment.service;

import com.example.spring_assignment.exception.CustomerNotFoundException;
import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.repository.CustomerRepository;
import com.example.spring_assignment.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerOrder> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public CustomerOrder getOrder(int id) {
        Optional<CustomerOrder> byId = orderRepository.findById(id);
        CustomerOrder tempCustomerOrder = null;
        if(byId.isPresent())
            tempCustomerOrder = byId.get();
        else
            throw new CustomerNotFoundException("Order not found - " + id);
        return tempCustomerOrder;
    }

    @Override
    public void saveOrder(CustomerOrderDTO customerOrderDTO, int id) {
        Optional<Customer> tempCustomer = customerRepository.findById(id);
        if(!tempCustomer.isPresent())
            throw new CustomerNotFoundException("Customer does not exist - " + id);
        CustomerOrder customerOrder= CustomerOrderDTO.convertDtoToEntity(customerOrderDTO);
        customerOrder.setCustomer(tempCustomer.get());
        orderRepository.save(customerOrder);
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

}
