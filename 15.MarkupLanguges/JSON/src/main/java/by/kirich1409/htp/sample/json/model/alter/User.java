package by.kirich1409.htp.sample.json.model.alter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krozov on 17.11.14.
 */
public class User {
    private static final String JSON_PROP_REGISTER_DATE = "register_date";

    private String name;
    private String registerDate;
    private List<Order> orders;
    private String email;

    public User(
            @JsonProperty("name") String name,
            @JsonProperty(JSON_PROP_REGISTER_DATE) String registerDate,
            @JsonProperty("orders") List<? extends Order> orders,
            @JsonProperty("email") String email) {
        this.name = name;
        this.registerDate = registerDate;
        this.orders = new ArrayList<>(orders);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROP_REGISTER_DATE)
    public String getRegisterDate() {
        return registerDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getEmail() {
        return email;
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
