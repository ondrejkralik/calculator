package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Created by okralik on 1. 10. 2015.
 */
public class DivideOperation implements IOperation {

    public String getOperation() {
        return "divide";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.divide(newValue);
    }
}
