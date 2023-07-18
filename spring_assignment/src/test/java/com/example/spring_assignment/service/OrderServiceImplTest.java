package com.example.spring_assignment.service;

import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.repository.CustomerRepository;
import com.example.spring_assignment.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderServiceImpl orderServiceImpl;

    @Test
    public void testFindAll(){
        List<CustomerOrder> orders = new ArrayList<>();
        when(orderRepository.findAll()).thenReturn(orders);
        List<CustomerOrder> orderReturned = orderServiceImpl.findAll();
        assertEquals(orders,orderReturned);
    }
    @Test
    public void testGetOrder(){
        int orderId = 2;
        CustomerOrder order = new CustomerOrder();
        order.setId(2);
        when(orderRepository.findById(2)).thenReturn(Optional.of(order));
        CustomerOrder tempOrder = orderServiceImpl.getOrder(orderId);
        assertEquals(order,tempOrder);
    }

    @Test(expected = RuntimeException.class)
    public void testGetOrderException(){
        orderServiceImpl.getOrder(-1);
    }

    @Test
    public void testSaveOrder(){
        Customer customer = new Customer();
        customer.setId(1);
        CustomerOrder order = new CustomerOrder();
        order.setId(1);
        order.setCustomer(customer);
        CustomerOrderDTO customerOrderDTO= CustomerOrderDTO.convertEntityToDto(order);
        when(customerRepository.findById(1)).thenReturn(Optional.of(customer));
        orderServiceImpl.saveOrder(customerOrderDTO,1);

        when(orderRepository.findById(1)).thenReturn(Optional.of(order));
        CustomerOrder tempOrder = orderServiceImpl.getOrder(1);

        assertEquals(customer,tempOrder.getCustomer());

    }

    @Test(expected = RuntimeException.class)
    public void testSaveOrderException(){
        orderServiceImpl.saveOrder(new CustomerOrderDTO(),12);
    }

    @Test
    public void testDeleteOrder() {
        orderServiceImpl.deleteOrder(1);
        verify(orderRepository).deleteById(1);
    }

}
