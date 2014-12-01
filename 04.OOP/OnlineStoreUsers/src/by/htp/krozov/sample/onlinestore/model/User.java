package by.htp.krozov.sample.onlinestore.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by krozov on 30.11.14.
 */
public class User {
    private final List<Order> orders = new ArrayList<Order>();
    private String nickname;
    private String name;
    private Date registrationDate;

    public User(String nickname, String name, Date registrationDate) {
        this.nickname = nickname;
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void addOrder(String id, String name) {
        this.orders.add(
                new Order(id, name, new Date())
        );
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;
        return nickname.equals(user.nickname);
    }

    @Override
    public int hashCode() {
        return nickname.hashCode();
    }

    @Override
    public String toString() {
        return nickname;
    }
}
