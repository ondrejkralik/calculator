package dk.cngroup.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

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
    public void testCalculate() throws Exception {

    }
}
