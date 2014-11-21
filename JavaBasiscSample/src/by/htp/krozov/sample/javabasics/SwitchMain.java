package by.htp.krozov.sample.javabasics;

import java.util.Calendar;

/**
 * Created by krozov on 21.11.14.
 */
public class SwitchMain {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String day;
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                day = "MONDAY";
                break;

            case Calendar.TUESDAY:
                day = "TUESDAY";
                break;

            case Calendar.WEDNESDAY:
                day = "WEDNESDAY";
                break;

            case Calendar.THURSDAY:
                day = "THURSDAY";
                break;

            case Calendar.FRIDAY:
                day = "FRIDAY";
                break;

            case Calendar.SATURDAY:
                day = "SATURDAY";
                break;

            case Calendar.SUNDAY:
                day = "SUNDAY";
                break;

            default:
                day = "Unknown";
        }

        System.out.println(day);
    }
}
