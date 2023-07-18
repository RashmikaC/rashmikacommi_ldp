package com.example.spring_assignment.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void testConstructor(){
        Customer customer = new Customer();
        assertNotNull(customer);
    }

    @Test
    public void testCustomerInitialization() {
        Customer customer = new Customer("John", "john@gmail.com");
        assertEquals("John", customer.getName());
        assertEquals("john@gmail.com", customer.getEmail());
    }

    @Test
    public void testToString() {
        Customer customer = new Customer("John", "john@gmail.com");
        assertEquals("Customer{id=0, name='John', email='john@gmail.com', orders=null}", customer.toString());
    }

    @Test
    public void testCustomerIdGeneration() {
        Customer customer = new Customer("John", "john@gmail.com");
        assertEquals(0, customer.getId());
    }

    @Test
    public void testId(){
        Customer customer = new Customer();
        customer.setId(1);
        assertEquals(1,customer.getId());
    }

    @Test
    public void testName(){
        Customer customer = new Customer();
        customer.setName("Maria");
        assertEquals("Maria",customer.getName());
    }

    @Test
    public void testEmail(){
        Customer customer = new Customer();
        customer.setEmail("m@gmail.com");
        assertEquals("m@gmail.com",customer.getEmail());
    }

    @Test
    public void testOrders(){
        Customer customer = new Customer();
        List<CustomerOrder> orderList = new ArrayList<>();
        orderList.add(new CustomerOrder());
        orderList.add(new CustomerOrder());
        customer.setOrders(orderList);
        assertEquals(orderList,customer.getOrders());
    }
}
