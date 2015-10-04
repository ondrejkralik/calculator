package dk.cngroup.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by okralik on 4. 10. 2015.
 */
public class MultiplyOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        MultiplyOperation operation = new MultiplyOperation();

        Assert.assertEquals("Operation is wrong.", "multiply", operation.getOperation());
    }

    @Test
    public void testCalculateNegative() throws Exception {
        MultiplyOperation operation = new MultiplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("50"),
                operation.calculate(new BigDecimal("-5"), new BigDecimal("-10")));
    }

    @Test
    public void testCalculatePositiveNegative() throws Exception {
        MultiplyOperation operation = new MultiplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-30"),
                operation.calculate(new BigDecimal("-3"), new BigDecimal("10")));
    }

    @Test
    public void testCalculatePositive() throws Exception {
        MultiplyOperation operation = new MultiplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("8"),
                operation.calculate(new BigDecimal("2"), new BigDecimal("4")));
    }
}
