package by.htp.krozov.samples.files;

import java.io.File;
import java.io.IOException;

/**
 * Created by krozov on 18.12.14.
 */
public class Main {

    public static final String USER_HOME = System.getProperty("user.home");
    public static final String TEMP_DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) throws Exception {
        if (USER_HOME != null) {
            printInfo(new File(USER_HOME));
        }

        if (TEMP_DIR != null) {
            File tempFile = new File(TEMP_DIR,
                                     "by.htp.krozov.samples.files/temp" + System.currentTimeMillis() + ".txt");

            System.out.println();
            if (tempFile.createNewFile()) {
                System.out.println("Temp file created.");
                printInfo(tempFile);
                if (!tempFile.renameTo(new File(TEMP_DIR, "remove.txt"))) {
                    System.out.println("Rename failed");
                }
                tempFile.delete();
            } else {
                System.out.println("Create temp file error.");
            }
        }
    }

    static void printInfo(File f) throws IOException {
        System.out.print(f.isDirectory() ? "Directory " : "File ");
        System.out.println('"' + f.getName() + "'");

        System.out.print("\tPath: ");
        System.out.println(f.getPath());

        System.out.print("\tAbsolute file path: ");
        System.out.println(f.getAbsolutePath());

        try {
            System.out.println("\tCanonical path: " + f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\tParent: ");
        System.out.println(f.getParent());

        if (f.isFile()) {
            System.out.printf("\tSize: % d bytes%n", f.length());
        }
    }
}
