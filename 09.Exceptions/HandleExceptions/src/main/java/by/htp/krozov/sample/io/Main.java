package by.htp.krozov.sample.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String... args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Empty args. Try again.");
        }
    }

    static void writeToFileHandleExceptionInside(String text, File to) {
        OutputStream outStream = null;
        try {
            try {
                outStream = new FileOutputStream(to); //Create new input stream.
                outStream.write(text.getBytes());
            } catch (IOException e) {
                System.out.printf("Error while write file: '%s'.", e).println();
            } finally {
                if (outStream != null) {
                    outStream.flush();
                    outStream.close();
                }
            }
        } catch (IOException e) {
            System.out.printf("Error close output stream: '%s'.", e).println();
        }
    }

    /**
     * Write text to file.
     *
     * @param text Text to write
     * @param to   Destination file path.
     * @throw RuntimeException If can't write file.
     */
    static void writeToFileWrapException(String text, File to) throws IOException {
        OutputStream outStream = null;
        try {
            outStream = new FileOutputStream(to); //Create new input stream.
            outStream.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Can't write file", e);
        } finally {
            if (outStream != null) {
                outStream.flush();
                outStream.close();
            }
        }
    }

    static void writeToFileThrowExceptionsOutside(String text, File to) throws IOException {
        OutputStream outStream = null;
        try {
            outStream = new FileOutputStream(to); //Create new input stream.
            outStream.write(text.getBytes());
        } finally {
            if (outStream != null) {
                outStream.flush();
                outStream.close();
            }
        }
    }
}
