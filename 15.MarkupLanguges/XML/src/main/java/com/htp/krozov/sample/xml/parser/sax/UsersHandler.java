package com.htp.krozov.sample.xml.parser.sax;

import com.htp.krozov.sample.xml.model.Order;
import com.htp.krozov.sample.xml.model.User;
import com.htp.krozov.sample.xml.parser.UserNodes;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by krozov on 08.01.15.
 */
public class UsersHandler extends DefaultHandler implements UserNodes {
    private List<User> users;
    private List<Order> tempOrders;
    private User tempUser;
    private Order tempOrder;
    private StringBuilder text;

    @Override
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts) throws SAXException {
        switch (localName) {
            case TAG_USERS:
                users = new ArrayList<User>();
                break;

            case TAG_USER:
                tempUser = new User();
                break;

            case TAG_ORDER:
                tempOrder = new Order();
                break;

            case TAG_ORDERS:
                tempOrders = new ArrayList<>();
                break;

            case TAG_DELIVERED:
            case TAG_ORDER_DATE:
            case TAG_REGISTER_DATE:
            case TAG_EMAIL:
            case TAG_NAME:
                text = new StringBuilder();
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        switch (localName) {
            case TAG_USERS:
                users = Collections.unmodifiableList(users);
                break;

            case TAG_USER:
                users.add(tempUser);
                tempUser = null;
                break;

            case TAG_ORDER:
                tempOrders.add(tempOrder);
                tempOrder = null;
                break;

            case TAG_ORDERS:
                tempUser.setOrders(tempOrders);
                tempOrders = null;
                break;

            case TAG_DELIVERED:
                tempOrder.setDelivered(Boolean.parseBoolean(text.toString()));
                break;

            case TAG_ORDER_DATE:
                tempOrder.setOrderDate(new Date(Long.parseLong(text.toString())));
                break;

            case TAG_REGISTER_DATE:
                tempUser.setRegisterDate(new Date(Long.parseLong(text.toString())));
                break;

            case TAG_EMAIL:
                tempUser.setName(text.toString());
                break;

            case TAG_NAME:
                if (tempOrder != null) {
                    tempOrder.setName(text.toString());
                } else {
                    tempUser.setName(text.toString());
                }
                break;
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
