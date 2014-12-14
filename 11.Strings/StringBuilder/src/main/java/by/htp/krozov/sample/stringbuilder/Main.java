package by.htp.krozov.sample.stringbuilder;

/**
 * Created by krozov on 14.12.14.
 */
public class Main {
    public static void main(String[] args) {
    }

    private static String concatUsingString(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            // Create new string and assign it to result variable.
            // !!!WRONG WAY!!!
            result += i + ' ';
        }
        return result;
    }

    private static String concatUsingStringBuilder(int start, int end) {
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
