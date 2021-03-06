package by.htp.krozov.sample.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
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

public class MainIO {

    public static final String TEXT_RESOURCE = "/text.txt";

    public static void main(String[] args) throws Exception {
        URL textURL = MainIO.class.getResource(TEXT_RESOURCE);

        if (textURL == null) {
            System.out.println("Resource not found");
            return;
        }

        //Create file
        File textFile = new File(textURL.toURI());
        if (!textFile.exists()) { //Check if it exists
            System.out.printf("File '%s' not exists.", textFile.getName()).println();
            return;
        }
        readFileByteStream(textFile);
    }

    private static void writeTextToFileByteStream(String text, File to) throws URISyntaxException {
        try (OutputStream outStream = new FileOutputStream(to)) {//Create new input stream.
            outStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.printf("Error while write file: '%s'.", e).println();
        }
    }

    private static void writeTextToFileCharStream(String text, File to) throws URISyntaxException {
        Writer writer = null;
        try {
            try {
                writer = new FileWriter(to); //Create new input stream.
                writer.write(text);
            } catch (IOException e) {
                System.out.printf("Error while write file: '%s'.", e).println();
            } finally {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            }
        } catch (IOException e) {
            System.out.printf("Error close output stream: '%s'.", e).println();
        }
    }

    private static void readFileByteStream(File from) throws URISyntaxException {
        InputStream is = null;
        try {
            try {
                is = new FileInputStream(from); //Create new input stream.

                StringBuilder sb = new StringBuilder();// StringBuilder for put reading result.

                byte[] buffer = new byte[1024];
                int byteReadCount;
                while ((byteReadCount = is.read(buffer)) != -1) {
                    sb.append(new String(buffer, 0, byteReadCount));
                }

                System.out.println(sb);
            } catch (IOException e) {
                System.out.printf("Error while read file: '%s'.", e).println();
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        } catch (IOException e) {
            System.out.printf("Error close input stream: '%s'.", e).println();
        }
    }

    private static void readFileCharStream(File from) throws URISyntaxException {
        Reader reader = null;
        try {
            try {
                Reader reader = new BufferedReader(new FileReader(from)); //Create new input stream.

                StringBuilder sb = new StringBuilder();// StringBuilder for put reading result.

                char[] buffer = new char[256];
                int charReadCount;
                while ((charReadCount = reader.read(buffer)) != -1) {
                    sb.append(buffer, 0, charReadCount);
                }

                System.out.println(sb);
            } catch (IOException e) {
                System.out.printf("Error while read file: '%s'.", e).println();
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        } catch (IOException e) {
            System.out.printf("Error close input stream: '%s'.", e).println();
        }
    }
}
