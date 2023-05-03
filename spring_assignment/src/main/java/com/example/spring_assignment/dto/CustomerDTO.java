package com.example.spring_assignment.dto;

import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerDTO {

    private int id;
    private String name;
    private String email;
    private List<CustomerOrder> customerOrders;

    @Autowired
    private static ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
    }

    public static Customer convertDtoToEntity(CustomerDTO customerDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(customerDTO, Customer.class);
    }

    public static CustomerDTO convertEntityToDto(Customer customer){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public CustomerDTO() {
    }

    public CustomerDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orders=" + customerOrders +
                '}';
    }
}
