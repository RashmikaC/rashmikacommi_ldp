package com.example.spring_assignment.service;

import com.example.spring_assignment.exception.CustomerNotFoundException;
import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        Optional<Customer> byId = customerRepository.findById(id);
        Customer customer = null;
        if(byId.isPresent())
            customer = byId.get();
        else
            throw new CustomerNotFoundException("Customer not found - " + id);
        return customer;
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerRepository.save(CustomerDTO.convertDtoToEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerOrder> getOrdersOfCustomerId(int id) {
        Optional<Customer> tempCustomer = customerRepository.findById(id);
        if(!tempCustomer.isPresent())
            throw  new CustomerNotFoundException("Customer does not exist - " + id);
        return tempCustomer.get().getOrders();
    }

}
