package by.kirich1409.htp.sample.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by krozov on 17.11.14.
 */
public class Order {
    private String name;

    @JsonProperty("order_date")
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
