package by.htp.krozov.sample.onlinestore.model;

import java.util.Date;

/**
 * Created by krozov on 30.11.14.
 */
public class Order {
    // Поля класса
    public static final int START_ID = 100;

    private static int nextId = START_ID;

    private final String id; // неизменяемое
    private String name;
    private Date createDate;
    private boolean delivered = false;

    {
        createDate = new Date();
    }

    // Конструктор по умолчанию
    public Order() {
        id = String.valueOf(nextId++);
    }

    //Дополнительный конструктор
    public Order(String id, String name, Date createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }

    //Дополнительный конструктор
    public Order(String id, String name) {
        this(id, name, new Date());
    }

    //Методы
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

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
}
