package com.example.spring_assignment.rest;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.rest.CustomerRestController;
import com.example.spring_assignment.service.CustomerService;
import com.example.spring_assignment.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRestControllerTest {
    @Mock
    private CustomerService customerService;

    @Mock
    private OrderService orderService;

    @InjectMocks
    private CustomerRestController controller;

    @Test
    public void testGetCustomers(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("John","john@gmail.com"));
        customerList.add(new Customer("Mary","mary@gmail.com"));
        when(customerService.findAll()).thenReturn(customerList);
        List<Customer> customers = controller.getCustomers();
        assertEquals(customerList,customers);
        assertEquals(2,customers.size());
    }
    @Test
    public void testGetCustomerById(){
        Customer customer = new Customer("John","john@gmail.com");
        customer.setId(1);
        when(customerService.getCustomer(1)).thenReturn(customer);
        assertEquals(customer,controller.getCustomer(1));
    }
    @Test(expected = RuntimeException.class)
    public void testExceptionGetCustomerById(){
        controller.getCustomer(-1);
    }

    @Test
    public void testAddCustomer() {
        Customer customer = new Customer( "John","john@gmail.com");
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        controller.addCustomer(customerDTO);

        verify(customerService, times(1)).saveCustomer(customerDTO);
    }

    @Test
    public void testUpdateCustomer() {
        Customer customer = new Customer( "John","john@gmail.com");
        CustomerDTO customerDTO=CustomerDTO.convertEntityToDto(customer);
        controller.updateCustomer(customerDTO);

        verify(customerService, times(1)).saveCustomer(customerDTO);
    }

    @Test
    public void testDeleteCustomer() {
        Customer customer = new Customer("John","john@gmail.com");
        customer.setId(1);
        when(customerService.getCustomer(1)).thenReturn(customer);

        controller.deleteCustomer(1);

        verify(customerService, times(1)).deleteCustomer(1);
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionDeleteCustomer(){
        controller.deleteCustomer(1);
    }

    @Test
    public void testGetOrders(){
        List<CustomerOrder> orderList = new ArrayList<>();
        orderList.add(new CustomerOrder("29-04-2023",100));
        when(orderService.findAll()).thenReturn(orderList);
        List<CustomerOrder> orders = controller.getOrders();
        assertEquals(orderList,orders);
    }

    @Test
    public void testGetOrder(){
        CustomerOrder order = new CustomerOrder("29-04-2023",100);
        order.setId(1);
        when(orderService.getOrder(1)).thenReturn(order);
        CustomerOrder tempOrder = controller.getOrder(1);
        assertEquals(order,tempOrder);
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionGetOrder(){
        controller.getOrder(1);
    }

    @Test
    public void testGetOrdersOfCustomer(){
        Customer customer = new Customer("John","john@gmail.com");
        customer.setId(1);
        List<CustomerOrder> orderList = new ArrayList<>();
        orderList.add(new CustomerOrder("29-04-2023",100));
        when(customerService.getOrdersOfCustomerId(1)).thenReturn(orderList);
        List<CustomerOrder> orders = controller.getOrdersOfCustomer(1);
        assertEquals(orderList,orders);
        verify(customerService,times(1)).getOrdersOfCustomerId(1);
    }

    @Test
    public void testSaveOrder(){
        Customer customer = new Customer("John","john@gmail.com");
        customer.setId(1);
        when(customerService.getCustomer(1)).thenReturn(customer);
        CustomerOrder order = new CustomerOrder("30-04-2023",150);
        CustomerOrderDTO customerOrderDTO=CustomerOrderDTO.convertEntityToDto(order);
        controller.saveOrder(1,customerOrderDTO);
        verify(orderService,times(1)).saveOrder(customerOrderDTO,1);
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionSaveOrder(){
        controller.saveOrder(1,new CustomerOrderDTO());
    }

    @Test
    public void testDeleteOrder(){
        CustomerOrder order = new CustomerOrder("29-04-2023",100);
        order.setId(10);
        when(orderService.getOrder(10)).thenReturn(order);
        controller.deleteOrder(10);
        verify(orderService,times(1)).deleteOrder(10);
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionDeleteOrder(){
        controller.deleteOrder(11);
    }

}
