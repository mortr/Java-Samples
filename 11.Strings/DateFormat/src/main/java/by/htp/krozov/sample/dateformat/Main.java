package by.htp.krozov.sample.dateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by krozov on 14.12.14.
 */
public class Main {
    private static final String DATE_ONLY_TIME_PATTERN = "HH:mm";
    private static final String DATE_TIME_YEAR_PATTERN = "HH:mm YYYY";

    public static void main(String[] args) {
        Date now = new Date();

        System.out.println("Format date with different methods.");

        DateFormat dateFormat = SimpleDateFormat.getDateInstance();
        System.out.println("SimpleDateFormat.getDateInstance(): " + dateFormat.format(now));

        dateFormat = SimpleDateFormat.getDateTimeInstance();
        System.out.println("SimpleDateFormat.getDateTimeInstance(): " + dateFormat.format(now));

        dateFormat = SimpleDateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("SimpleDateFormat.getDateInstance(DateFormat.FULL): " + dateFormat.format(now));

        dateFormat = SimpleDateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("SimpleDateFormat.getDateInstance(DateFormat.MEDIUM): " + dateFormat.format(now));

        dateFormat = SimpleDateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("SimpleDateFormat.getDateInstance(DateFormat.SHORT): " + dateFormat.format(now));

        dateFormat = new SimpleDateFormat(DATE_ONLY_TIME_PATTERN);
        System.out.println("new SimpleDateFormat(\"HH:mm\"): " + dateFormat.format(now));

        dateFormat = new SimpleDateFormat(DATE_TIME_YEAR_PATTERN);
        System.out.println("new SimpleDateFormat(\"HH:mm YYYY\"): " + dateFormat.format(now));
    }
}
