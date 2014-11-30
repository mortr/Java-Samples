package by.kirich1409.htp.sample.json;

import by.kirich1409.htp.sample.json.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URL;

public class Main {

    public static final String MARKET_JSON = "/market.json";
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        User[] users = deserialize();
        for (User user : users) {
            System.out.println(user);
        }
        serialize(users, "users.json");
    }

    private static User[] deserialize() throws java.io.IOException {
        URL resource = Main.class.getResource(MARKET_JSON);
        return MAPPER.readValue(resource, User[].class);
    }

    private static void serialize(User[] users, String to) throws java.io.IOException {
        File resultFile = new File(to);
        if (resultFile.exists() || resultFile.createNewFile()) {
            MAPPER.writeValue(resultFile, users);
        }
    }
}
