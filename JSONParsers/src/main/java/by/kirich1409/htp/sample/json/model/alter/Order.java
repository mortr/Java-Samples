package by.kirich1409.htp.sample.json.model.alter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by krozov on 17.11.14.
 */
public class Order {
    private String name;
    private Date orderDate;
    private boolean delivered;

    @JsonCreator
    public Order(
            @JsonProperty("name") String name,
            @JsonProperty("order_date") Date orderDate,
            @JsonProperty("delivered") boolean delivered) {
        this.name = name;
        this.orderDate = orderDate;
        this.delivered = delivered;
    }

    @JsonProperty("order_date")
    public String getName() {
        return name;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public boolean isDelivered() {
        return delivered;
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
