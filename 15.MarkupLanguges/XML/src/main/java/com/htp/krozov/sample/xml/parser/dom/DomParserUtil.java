package com.htp.krozov.sample.xml.parser.dom;

import com.htp.krozov.sample.xml.parser.UserNodes;
import com.htp.krozov.sample.xml.model.Order;
import com.htp.krozov.sample.xml.model.User;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by krozov on 08.01.15.
 */
public final class DomParserUtil implements UserNodes {

    public static List<User> parse(InputStream is) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = documentBuilder.parse(is);
        NodeList usersNode = doc.getChildNodes().item(0).getChildNodes();
        return parseUsers(usersNode);
    }

    private static Order parseOrder(Node orderNode) {
        Order order = new Order();
        NodeList nodes = orderNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node childNode = nodes.item(i);
            if (childNode.getNodeName() == null) {
                continue;
            }

            if (TAG_NAME.equals(childNode.getNodeName())) {
                order.setName(childNode.getFirstChild().getNodeValue());
            } else if (TAG_DELIVERED.equals(childNode.getNodeName())) {
                order.setDelivered(Boolean.parseBoolean(childNode.getFirstChild().getNodeValue()));
            } else if (TAG_ORDER_DATE.equals(childNode.getNodeName())) {
                order.setOrderDate(new Date(Long.parseLong(childNode.getFirstChild().getNodeValue())));
            }
        }
        return order;
    }

    private static List<Order> parseOrders(NodeList l) {
        final int cnt = l.getLength();
        List<Order> orders = new ArrayList<Order>();
        for (int i = 0; i < cnt; i++) {
            if (TAG_ORDER.equals(l.item(i).getNodeName())) {
                orders.add(parseOrder(l.item(i)));
            }
        }
        return orders;
    }

    private static User parseUser(Node userNode) {
        User user = new User();
        NodeList nodes = userNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node childNode = nodes.item(i);
            if (childNode.getNodeName() == null) {
                continue;
            }

            if (TAG_NAME.equals(childNode.getNodeName())) {
                user.setName(childNode.getFirstChild().getNodeValue());
            } else if (TAG_EMAIL.equals(childNode.getNodeName())) {
                user.setEmail(childNode.getFirstChild().getNodeValue());
            } else if (TAG_REGISTER_DATE.equals(childNode.getNodeName())) {
                user.setRegisterDate(
                        new Date(Long.parseLong(childNode.getFirstChild().getNodeValue())));
            } else if (TAG_ORDERS.equals(childNode.getNodeName())) {
                user.setOrders(parseOrders(childNode.getChildNodes()));
            }
        }
        return user;
    }

    private static List<User> parseUsers(NodeList l) {
        final int cnt = l.getLength();
        List<User> users = new ArrayList<User>(cnt);
        for (int i = 0; i < cnt; i++) {
            if (TAG_USER.equals(l.item(i).getNodeName())) {
                users.add(parseUser(l.item(i)));
            }
        }
        return users;
    }
}
