package com.example.spring_assignment.service;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.repository.CustomerRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceImplTest {
    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;

    @BeforeEach
    public void setup() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll() {
        Customer customer = new Customer("John", "j@gmail.com");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        when(customerServiceImpl.findAll()).thenReturn(customers);
        List<Customer> actualCustomers = customerServiceImpl.findAll();

        assertEquals(customers, actualCustomers);
        verify(customerRepository, times(1)).findAll();
    }

    @Test
    public void testSaveCustomer() {
        Customer customer = new Customer("John", "j@gmail.com");
        CustomerDTO customerDTO=CustomerDTO.convertEntityToDto(customer);
        customerServiceImpl.saveCustomer(customerDTO);

        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        Customer actualCustomer = customerServiceImpl.getCustomer(1);
        assertEquals(customer, actualCustomer);
    }

    @Test
    public void testGetCustomer() {
        Customer customer = new Customer("John", "j@gmail.com");
        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        Customer actualCustomer = customerServiceImpl.getCustomer(1);
        assertEquals(customer, actualCustomer);
        verify(customerRepository, times(1)).findById(1);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCustomerNotFound() {
        customerServiceImpl.getCustomer(-1);
    }

    @Test
    public void testDeleteCustomer() {
        customerServiceImpl.deleteCustomer(1);
        verify(customerRepository, times(1)).deleteById(1);
    }

    @Test
    public void testGetOrdersOfCustomerId() {
        Customer customer = new Customer("John", "j@gmail.com");
        CustomerOrder order = new CustomerOrder("20-04-2023",250);
        customer.setOrders(Arrays.asList(order));
        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        List<CustomerOrder> theOrders = customerServiceImpl.getOrdersOfCustomerId(1);
        assertEquals(Arrays.asList(order), theOrders);
        verify(customerRepository, times(1)).findById(1);
    }

    @Test(expected = RuntimeException.class)
    public  void testExceptionForOrderOfCustomerId(){
        customerServiceImpl.getOrdersOfCustomerId(-1);
    }
}
