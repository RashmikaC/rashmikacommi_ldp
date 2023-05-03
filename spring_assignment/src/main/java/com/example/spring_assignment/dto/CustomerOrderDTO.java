package com.example.spring_assignment.dto;

import com.example.spring_assignment.entity.Customer;
import com.example.spring_assignment.entity.CustomerOrder;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerOrderDTO {
    private int id;
    private String date;
    private int amount;
    private Customer customer;

    @Autowired
    private static ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
    }

    public static CustomerOrder convertDtoToEntity(CustomerOrderDTO customerOrderDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(customerOrderDTO, CustomerOrder.class);
    }


    public static CustomerOrderDTO convertEntityToDto(CustomerOrder customerOrder){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(customerOrder, CustomerOrderDTO.class);
    }

    public CustomerOrderDTO() {
    }

    public CustomerOrderDTO(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}
