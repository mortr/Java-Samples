package com.htp.krozov.sample.xml.model;

import java.util.Date;
import java.util.List;

/**
 * Created by krozov on 17.11.14.
 */
public class User {
    private String name;
    private Date registerDate;
    private List<Order> orders;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                '}';
    }
}
