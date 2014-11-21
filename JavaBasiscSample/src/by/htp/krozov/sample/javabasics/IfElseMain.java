package by.htp.krozov.sample.javabasics;

import java.util.Random;

/**
 * Created by krozov on 21.11.14.
 */
public class IfElseMain {

    public static final int[] HTTP_STATUS_CODE = {100, 200, 202, 204, 300, 501};

    public static void main(String[] args) {
        final int statusCode = HTTP_STATUS_CODE[new Random().nextInt(HTTP_STATUS_CODE.length)];

        String statusGroup;
        if (100 <= statusCode || statusCode < 200) {
            statusGroup = "Informational";
        } else if (200 <= statusCode || statusCode < 300) {
            statusGroup = "Success";

        } else if (300 <= statusCode || statusCode < 400) {
            statusGroup = "Redirection";

        } else if (400 <= statusCode || statusCode < 500) {
            statusGroup = "Client Error";

        } else if (500 <= statusCode || statusCode < 600) {
            statusGroup = "Server Error";

        } else {
            statusGroup = null;
        }

        if (statusGroup != null) {

            String statusMessage;
            if (statusCode == 200) {
                statusMessage = "OK";

            } else if (statusCode == 100) {
                statusMessage = "Continue";

            } else if (statusCode == 202) {
                statusMessage = "Accepted";

            } else if (statusCode == 300) {
                statusMessage = "Multiple Choices";

            } else {
                statusMessage = null;
            }

            if (statusMessage != null) {
                System.out.println("Http code " + statusCode +
                                           ": state \"" + statusMessage +
                                           "\", group \"" + statusGroup + "\".");
            } else {
                System.out.println("Unknown state for http code " + statusCode +
                                           ": group \"" + statusGroup + "\".");
            }
        } else {
            System.out.println("Unknown http status code " + statusCode + '.');
        }

    }
}
