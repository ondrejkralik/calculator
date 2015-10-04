package dk.cngroup.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by okralik on 4. 10. 2015.
 */
public class ApplyOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        ApplyOperation operation = new  ApplyOperation();

        Assert.assertEquals("Operation is wrong.", "apply", operation.getOperation());
    }

    @Test
    public void testCalculateNegative() throws Exception {
        ApplyOperation operation = new ApplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-10"),
                operation.calculate(new BigDecimal("-5"), new BigDecimal("-10")));
    }

    @Test
    public void testCalculatePositiveNegative() throws Exception {
        ApplyOperation operation = new ApplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("10"),
                operation.calculate(new BigDecimal("-3"), new BigDecimal("10")));
    }

    @Test
    public void testCalculatePositive() throws Exception {
        ApplyOperation operation = new ApplyOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("4"),
                operation.calculate(new BigDecimal("2"), new BigDecimal("4")));
    }
}
