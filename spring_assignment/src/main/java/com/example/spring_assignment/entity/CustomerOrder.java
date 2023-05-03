package com.example.spring_assignment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "customer_order")
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "amount")
    private int amount;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    @JsonIgnore //annotation to ignore the circular reference property, which means that it will not be serialized to JSON
    private Customer customer;

    public CustomerOrder(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public CustomerOrder(){}

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
