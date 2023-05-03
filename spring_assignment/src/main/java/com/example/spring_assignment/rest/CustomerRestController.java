package com.example.spring_assignment.rest;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.exception.CustomerNotFoundException;
import com.example.spring_assignment.service.CustomerService;
import com.example.spring_assignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){

        Customer tempCustomer = customerService.getCustomer(customerId);

        if(tempCustomer == null)
            throw new CustomerNotFoundException("Customer not found" + customerId);

        return tempCustomer;
    }

    @PostMapping("/customers")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO){
        customerDTO.setId(0);
        customerService.saveCustomer(customerDTO);
        return customerDTO;
    }

    @PutMapping("/customers")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);
        return customerDTO;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        if(customerService.getCustomer(customerId) == null)
            throw new CustomerNotFoundException("Customer does not exist - " + customerId);
        customerService.deleteCustomer(customerId);
        return "Deleted customer - " + customerId;
    }

    @GetMapping("/orders")
    public List<CustomerOrder> getOrders(){
        return orderService.findAll();
    }

    @GetMapping("/order/{orderId}")
    public CustomerOrder getOrder(@PathVariable int orderId){

        CustomerOrder theOrder = orderService.getOrder(orderId);

        if(theOrder == null)
            throw new CustomerNotFoundException("Order not found" + orderId);

        return theOrder;
    }


    @GetMapping("/orders/{customerId}")
    public List<CustomerOrder> getOrdersOfCustomer(@PathVariable int customerId){
        return customerService.getOrdersOfCustomerId(customerId);
    }


    @PostMapping("/orders/{customerId}")
    public CustomerOrderDTO saveOrder(@PathVariable int customerId,@RequestBody CustomerOrderDTO orderDTO){
        if(customerService.getCustomer(customerId) == null)
            throw new CustomerNotFoundException("Customer does not exist - " + customerId);
        orderService.saveOrder(orderDTO,customerId);
        return orderDTO;
    }

    @DeleteMapping("/orders/{orderId}")
    public String deleteOrder(@PathVariable int orderId){
        if(orderService.getOrder(orderId) == null)
            throw new CustomerNotFoundException("Ticket does not exist - " + orderId);
        orderService.deleteOrder(orderId);
        return "Deleted order - " + orderId;
    }
}
