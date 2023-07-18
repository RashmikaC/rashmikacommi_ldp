package com.example.spring_assignment.controller;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.service.CustomerService;
import com.example.spring_assignment.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {
    @Mock
    private CustomerService customerService;

    @Mock
    private OrderService orderService;

    @Mock
    private Model model;

    @InjectMocks
    private CustomerController customerController;

    @Test
    public void testListEmployees() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        when(customerService.findAll()).thenReturn(customers);
        String view = customerController.listCustomers(model);
        assertEquals("list-customers", view);
        verify(customerService, times(1)).findAll();
    }

    @Test
    public void testShowFormForAdd() {
        String view = customerController.showFormForAdd(model);
        assertEquals("customer-form", view);
        verify(model, times(1)).addAttribute(eq("customer"), any(Customer.class));
    }

    @Test
    public void testShowFormForUpdate() {
        int customerId = 1;
        Customer customer = new Customer();
        customer.setId(customerId);
        when(customerService.getCustomer(customerId)).thenReturn(customer);
        String view = customerController.showFormForUpdate(customerId, model);
        assertEquals("customer-form", view);
        verify(customerService, times(1)).getCustomer(customerId);
        verify(model, times(1)).addAttribute("customer", customer);
    }

    @Test
    public void testSaveCustomer() {
        CustomerDTO customerDTO=new CustomerDTO();
        String view = customerController.saveCustomer(customerDTO);
        assertEquals("redirect:/customers/list", view);
        verify(customerService, times(1)).saveCustomer(customerDTO);
    }

    @Test
    public void testDelete() {
        int customerId = 1;
        String view = customerController.delete(customerId);
        assertEquals("redirect:/customers/list", view);
        verify(customerService, times(1)).deleteCustomer(customerId);
    }

    @Test
    public void testGetOrders(){
        List<CustomerOrder> orderList = new ArrayList<>();
        orderList.add(new CustomerOrder());
        orderList.add(new CustomerOrder());
        when(customerService.getOrdersOfCustomerId(1)).thenReturn(orderList);
        String view  = customerController.getOrders(1,model);
        assertEquals("list-orders",view);
        verify(customerService).getOrdersOfCustomerId(1);
        verify(model).addAttribute("orders",orderList);
    }

    @Test
    public void testShowFormToOrder(){
        String view = customerController.showFormToOrder(1,model);
        assertEquals("order-form",view);
    }


    @Test
    public void testSaveOrder(){
        CustomerOrder order = new CustomerOrder();
        order.setId(1);
        order.setDate("20-04-2023");
        order.setAmount(1020);
        order.setCustomer(new Customer("John","john@gmail.com"));

        CustomerOrderDTO customerOrderDTO=CustomerOrderDTO.convertEntityToDto(order);
        String view = customerController.saveOrder(1,customerOrderDTO);
        assertEquals("redirect:/customers/orders/1",view);
        verify(orderService).saveOrder(customerOrderDTO,1);
    }

    @Test
    public void testDeleteTicket(){
        String view = customerController.deleteOrder(10,1);
        assertEquals("redirect:/customers/orders/1",view);
        verify(orderService,times(1)).deleteOrder(10);
    }

    @Test
    public void initBinderTest() {
        WebDataBinder dataBinder = mock(WebDataBinder.class);
        customerController.initBinder(dataBinder);

        // verify that the StringTrimmerEditor was registered with the dataBinder
        verify(dataBinder, times(1)).registerCustomEditor(eq(String.class), any(StringTrimmerEditor.class));
    }
}
