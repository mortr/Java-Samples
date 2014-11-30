package by.htp.kirich1409.sample.classes;

import by.htp.kirich1409.sample.classes.model.Order;
import by.htp.kirich1409.sample.classes.model.User;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user = new User("user_1", "Jack Smith", new Date());
        user.addOrder(new Order("order_1", "Test order", new Date()));

        Order order2 = new Order("order_2", "Test order 2", new Date());
        order2.setDelivered(true);
        user.addOrder(order2);

        System.out.println(user);
        System.out.println("Orders: ");
        List<Order> orders = user.getOrders();
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
