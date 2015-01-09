package com.htp.krozov.sample.xml.model;

import java.util.Date;

/**
 * Created by krozov on 17.11.14.
 */
public class Order {
    private String name;

    private Date orderDate;

    private boolean delivered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderDate=" + orderDate +
                ", delivered=" + delivered +
                '}';
    }
}
