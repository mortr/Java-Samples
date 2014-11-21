package by.kirich1409.htp.sample.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by krozov on 17.11.14.
 */
public class User {
    private String name;
    @JsonProperty("register_date")
    private String registerDate;
    private List<Order> orders;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
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
