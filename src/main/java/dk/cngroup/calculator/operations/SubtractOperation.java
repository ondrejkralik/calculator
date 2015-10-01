package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Created by okralik on 1. 10. 2015.
 */
public class SubtractOperation implements IOperation {

    public String getOperation() {
        return "subtract";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.subtract(newValue);
    }
}
