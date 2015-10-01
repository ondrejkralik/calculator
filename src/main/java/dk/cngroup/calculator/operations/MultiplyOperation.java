package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Created by okralik on 1. 10. 2015.
 */
public class MultiplyOperation implements IOperation {

    public String getOperation() {
        return "multiply";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.multiply(newValue);
    }
}
