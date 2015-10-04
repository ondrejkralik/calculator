package dk.cngroup.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }


    @Test
    public void test1() {
        URL url = getClass().getResource("/test1.txt");
        App.main(new String[]{url.getFile()});

        Assert.assertEquals("15", outContent.toString());
    }

    @Test
    public void test2() {
        URL url = getClass().getResource("/test2.txt");
        App.main(new String[]{url.getFile()});

        Assert.assertEquals("45", outContent.toString());
    }

    @Test
    public void test3() {
        URL url = getClass().getResource("/test3.txt");
        App.main(new String[]{url.getFile()});

        Assert.assertEquals("1", outContent.toString());
    }

    @Test
    public void testFileNotExists() {
        App.main(new String[]{"/nothing.txt"});

        Assert.assertEquals("ERROR: Input file not found." + System.getProperty("line.separator"), errContent.toString());
    }
}
