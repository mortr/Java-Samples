package by.htp.krozov.sample.regex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by krozov on 14.12.14.
 */
@RunWith(JUnit4.class)
public class StringUtilsTest {
    @Test
    public void testSearchNumber() throws Exception {
        String text = "320.0 -712 -227840.001 -0.17 0.12 .1";
        double[] numbers = StringUtils.searchNumbers(text);
        double[] expectedNumbers = {
                320.0,
                -712,
                -227840.001,
                -0.17,
                0.12,
                .1
        };
        Assert.assertArrayEquals(expectedNumbers, numbers, 10E-1);
    }

    @Test
    public void testCleanText() throws Exception {
        String text = "\t\tHi,  Student\n\n";
        String cleanText = StringUtils.cleanText(text);
        Assert.assertEquals("Hi, Student", cleanText);
    }
}
