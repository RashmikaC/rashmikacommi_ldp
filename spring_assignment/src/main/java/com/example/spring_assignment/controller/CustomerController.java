package com.example.spring_assignment.controller;

import com.example.spring_assignment.dto.CustomerDTO;
import com.example.spring_assignment.dto.CustomerOrderDTO;
import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import com.example.spring_assignment.service.CustomerService;
import com.example.spring_assignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    //add an initbinder ... to convert trim input strings
    //remove leading and trailing whitespace
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/list")
    public String listCustomers(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Customer tempCustomer = new Customer();

        theModel.addAttribute("customer", tempCustomer);

        return "customer-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
                                    Model theModel) {

        Customer tempCustomer = customerService.getCustomer(theId);

        theModel.addAttribute("customer", tempCustomer);
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);
        return "redirect:/customers/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("customerId") int theId) {
        customerService.deleteCustomer(theId);
        return "redirect:/customers/list";
    }

    @GetMapping("/orders/{customerId}")
    public String getOrders(@PathVariable("customerId") int id,Model model){
        List<CustomerOrder> orderList = customerService.getOrdersOfCustomerId(id);
        model.addAttribute("orders",orderList);
        model.addAttribute("customerId",id);
        return "list-orders";
    }
    @GetMapping("/showFormToOrder")
    public String showFormToOrder(@RequestParam("customerId") int id, Model theModel) {

        CustomerOrder order = new CustomerOrder();
        theModel.addAttribute("order", order);
        theModel.addAttribute("customerId",id);
        return "order-form";
    }

    @PostMapping("/saveOrder/{customerId}")
    public String saveOrder(@PathVariable("customerId") int id,@ModelAttribute("order") CustomerOrderDTO orderDTO){
        orderService.saveOrder(orderDTO,id);
        return "redirect:/customers/orders/" + id;
    }

    @GetMapping("/{customerId}/orderDelete/{orderId}")
    public String deleteOrder(@PathVariable("orderId") int theId,@PathVariable("customerId") int customerId) {
        orderService.deleteOrder(theId);
        return "redirect:/customers/orders/" + customerId;
    }

}
