package dk.cngroup.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        App.main(new String[]{"/test1.txt"});
        Assert.assertEquals("15", outContent.toString());
    }

    @Test
    public void test2() {
        App.main(new String[]{"/test2.txt"});
        Assert.assertEquals("45", outContent.toString());
    }

    @Test
    public void test3() {
        App.main(new String[]{"/test3.txt"});
        Assert.assertEquals("1", outContent.toString());
    }
}
