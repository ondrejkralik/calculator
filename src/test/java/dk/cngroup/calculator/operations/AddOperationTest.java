package dk.cngroup.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AddOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        AddOperation operation = new AddOperation();

        Assert.assertEquals("Operation is wrong.", "add", operation.getOperation());
    }

    @Test
    public void testCalculateNegative() throws Exception {
        AddOperation operation = new AddOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("-15"),
                operation.calculate(new BigDecimal("-5"), new BigDecimal("-10")));
    }

    @Test
    public void testCalculatePositiveNegative() throws Exception {
        AddOperation operation = new AddOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("7"),
                operation.calculate(new BigDecimal("-3"), new BigDecimal("10")));
    }

    @Test
    public void testCalculatePositive() throws Exception {
        AddOperation operation = new AddOperation();

        Assert.assertEquals("Result is wrong.",
                new BigDecimal("6"),
                operation.calculate(new BigDecimal("2"), new BigDecimal("4")));
    }
}
