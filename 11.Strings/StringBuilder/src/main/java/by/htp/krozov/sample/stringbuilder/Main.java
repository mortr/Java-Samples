package by.htp.krozov.sample.stringbuilder;

/**
 * Created by krozov on 14.12.14.
 */
public class Main {
    // Compiler convert this strings concatenation in single string,
    // because only string literals participate in operation..
    public static String LONG_TEXT = "Hello. This is sample for students."
            + "I need demonstrate how string concatenation work."
            + "This is all.";

    static String concatVariables() {
        int x = 10;
        String s = "tut";
        boolean b = false;
        // Compiler convert this code to StringBuilder. Performance does not suffer.
        return x + "; " + s + ": " + b;
    }

    static String concatUsingString(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            // Create new string and assign it to result variable.
            // !!!WRONG WAY!!!
            result += i + ' ';
        }
        return result;
    }

    static String concatUsingStringBuilder(int start, int end) {
        // Create new StringBuilder. It represents empty string.
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            // Add current
            // No string recreation. True way.
            result.append(i);
            result.append(' ');
        }
        return result.toString();
    }
}
