package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Multiply operation (*)
 */
public class MultiplyOperation implements IOperation {

    public String getOperation() {
        return "multiply";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.multiply(newValue);
    }
}
