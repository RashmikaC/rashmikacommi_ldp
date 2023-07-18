package com.example.spring_assignment.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerOrderTest {

    @Test
    public void testConstructor(){
        CustomerOrder customerOrder = new CustomerOrder();
        assertNotNull(customerOrder);
    }

    @Test
    public void testInitializer(){
        CustomerOrder customerOrder = new CustomerOrder("29-04-2023",1000);
        assertEquals("29-04-2023",customerOrder.getDate());
        assertEquals(1000,customerOrder.getAmount());
    }

    @Test
    public void testToString(){
        CustomerOrder customerOrder = new CustomerOrder("29-04-2023",1000);
        assertEquals("CustomerOrder{id=0, date='29-04-2023', amount=1000, customer=null}", customerOrder.toString());
    }

    @Test
    public void testId(){
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setId(1);
        assertEquals(1, customerOrder.getId());
    }

    @Test
    public void testDate(){
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setDate("30-04-2023");
        assertEquals("30-04-2023",customerOrder.getDate());
    }

    @Test
    public void testAmount(){
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setAmount(1000);
        assertEquals(1000,customerOrder.getAmount());
    }

    @Test
    public void testCustomer(){
        CustomerOrder customerOrder = new CustomerOrder();
        Customer customer = new Customer();
        customerOrder.setCustomer(customer);
        assertEquals(customer, customerOrder.getCustomer());
    }

}
