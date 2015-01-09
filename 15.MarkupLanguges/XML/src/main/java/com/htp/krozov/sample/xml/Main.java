package com.htp.krozov.sample.xml;

import com.htp.krozov.sample.xml.parser.dom.DomParserUtil;
import com.htp.krozov.sample.xml.model.User;
import com.htp.krozov.sample.xml.parser.sax.UsersHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

/**
 * Created by krozov on 08.01.15.
 */
public class Main {
    public static final String USERS_XMl = "/users.xml";

    public static void main(String[] args) throws Exception {
        List<User> users = parseSax();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static List<User> parseDom() throws ParserConfigurationException, IOException, SAXException {
        return DomParserUtil.parse(Main.class.getResourceAsStream(USERS_XMl));
    }

    private static List<User> parseSax() throws ParserConfigurationException, IOException, SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        UsersHandler handler = new UsersHandler();
        saxParser.parse(Main.class.getResourceAsStream(USERS_XMl), handler);
        return handler.getUsers();
    }
}
