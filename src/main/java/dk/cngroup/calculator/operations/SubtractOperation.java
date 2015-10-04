package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Subtract operation (-)
 */
public class SubtractOperation implements IOperation {

    public String getOperation() {
        return "subtract";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.subtract(newValue);
    }
}
