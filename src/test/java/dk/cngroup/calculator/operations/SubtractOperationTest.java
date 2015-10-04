package dk.cngroup.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by okralik on 4. 10. 2015.
 */
public class SubtractOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        SubtractOperation operation = new SubtractOperation();

        Assert.assertEquals("Operation is wrong.", "subtract", operation.getOperation());
    }

    @Test
    public void testCalculateNegative() throws Exception {
        SubtractOperation operation = new SubtractOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("5"),
                operation.calculate(new BigDecimal("-5"), new BigDecimal("-10")));
    }

    @Test
    public void testCalculatePositiveNegative() throws Exception {
        SubtractOperation operation = new SubtractOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-13"),
                operation.calculate(new BigDecimal("-3"), new BigDecimal("10")));
    }

    @Test
    public void testCalculatePositive() throws Exception {
        SubtractOperation operation = new SubtractOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-2"),
                operation.calculate(new BigDecimal("2"), new BigDecimal("4")));
    }
}
