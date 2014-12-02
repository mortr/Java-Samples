package by.htp.krozov.sample.onlinestore.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Online store user representation.
 *
 * @author Kirill Rozov
 * @created 30.11.14
 */
public class User {
    private final List<Order> orders = new ArrayList<Order>();
    private String nickname;
    private String name;
    private Date registrationDate;
    private final Contacts contacts;

    public User(String nickname, String name, Date registrationDate, String email) {
        this.nickname = nickname;
        this.name = name;
        this.registrationDate = registrationDate;
        contacts = new Contacts(email);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void addOrder(String id, String name) {
        this.orders.add(
                new Order(id, name, new Date())
        );
    }

    public Contacts getContacts() {
        return contacts;
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

    /**
     * User contacts information.
     */
    public static class Contacts {
        private String mobilePhone;
        private String email;
        private String skype;

        public Contacts(String email) {
            this.email = email;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSkype() {
            return skype;
        }

        public void setSkype(String skype) {
            this.skype = skype;
        }
    }
}
