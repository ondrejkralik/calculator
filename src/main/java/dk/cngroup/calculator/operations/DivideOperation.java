package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Divide operation (/)
 */
public class DivideOperation implements IOperation {

    public String getOperation() {
        return "divide";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.divide(newValue);
    }
}
