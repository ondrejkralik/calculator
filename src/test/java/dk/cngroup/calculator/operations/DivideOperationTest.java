package dk.cngroup.calculator.operations;

import dk.cngroup.calculator.exception.IllegalDataException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by okralik on 4. 10. 2015.
 */
public class DivideOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        DivideOperation operation = new DivideOperation();

        Assert.assertEquals("Operation is wrong.", "divide", operation.getOperation());
    }

    @Test
    public void testCalculateNegative() throws Exception {
        DivideOperation operation = new DivideOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("5"),
                operation.calculate(new BigDecimal("-15"), new BigDecimal("-3")));
    }

    @Test
    public void testCalculatePositiveNegative() throws Exception {
        DivideOperation operation = new DivideOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-3"),
                operation.calculate(new BigDecimal("-30"), new BigDecimal("10")));
    }

    @Test
    public void testCalculatePositive() throws Exception {
        DivideOperation operation = new DivideOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("3"),
                operation.calculate(new BigDecimal("6"), new BigDecimal("2")));
    }

    @Test(expected = IllegalDataException.class)
    public void testDivideByZero() throws Exception {
        DivideOperation operation = new DivideOperation();

        operation.calculate(new BigDecimal("6"), new BigDecimal("0"));
        Assert.fail("Exception wasn't thrown.");
    }
}
