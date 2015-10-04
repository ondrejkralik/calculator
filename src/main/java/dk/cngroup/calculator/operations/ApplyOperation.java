package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Apply operation
 */
public class ApplyOperation implements IOperation {

    @Override
    public String getOperation() {
        return "apply";
    }

    @Override
    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return newValue;
    }
}
