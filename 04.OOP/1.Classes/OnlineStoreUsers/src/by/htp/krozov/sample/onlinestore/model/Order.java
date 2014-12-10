package by.htp.krozov.sample.onlinestore.model;

import java.util.Date;

/**
 * Order in online store.
 *
 * @author Kirill Rozov
 * @created 30.11.14
 */
public class Order {
    // Class fields START
    private static int nextId = 1;

    private final String id; // unmodifiable
    private String name;
    private Date createDate;
    private boolean delivered = false;

    // Class fields END

    //Constructors START

    // Default class constructor
    public Order() {
        id = String.valueOf(nextId++);
    }

    // Other class constructors
    public Order(String id, String name, Date createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }

    public Order(String id, String name) {
        this(id, name, new Date());
    }

    //Constructors END

    // Methods START

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { // Check is other object is the same object for what method call.
            return true;
        }
        if (o == null // Check is object null
                || getClass() != o.getClass()) { // If not null check it this object
                                                 // and other object are instance of the same class
            return false;
        }

        // Check objects by their internal properties
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", delivered=" + delivered +
                '}';
    }

    // Methods END
}
