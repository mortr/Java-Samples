package by.htp.krozov.sample.javabasics;

public class AbcForMain {

    /**
     * Print characters from 'a' to 'z' by line.
     * Count of characters in line is equal line number.
     */
    public static void main(String[] args) {
        int line = 1; // Line number
        for (char curCharacter = 'a'; // Create variable with current character and set it to 'a'
             curCharacter != 'z'; // Execute cycle body while 'a' < 'z'
             curCharacter++, line++) { // Modify current character and line number

            // Print characters in current line
            for (int symbolIndex = 0; symbolIndex < line; symbolIndex++) {
                System.out.print(curCharacter);
            }

            System.out.println(); // Print line break in end of current line
        }
    }
}
