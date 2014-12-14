package by.htp.krozov.sample.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by krozov on 14.12.14.
 */
public class StringUtils {

    static double[] searchNumbers(String text) {
        Pattern pattern = Pattern.compile("[+-]?\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(text);

        List<Double> numbers = new ArrayList<Double>();
        while (matcher.find()) {
            String number = text.substring(matcher.start(), matcher.end());
            numbers.add(Double.parseDouble(number));
        }

        double[] result = new double[numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    static String cleanText(String text) {
        String result = text.replaceAll("\\A\\s+", ""); // Remove all space symbol at start
        result = result.replaceAll("\\s+\\z", ""); // Remove all space symbol at end
        result = result.replaceAll(" {2,}", " "); // Substitute two or more ' ' symbol to one
        return result;
    }
}
