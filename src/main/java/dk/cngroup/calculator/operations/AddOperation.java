package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Add operation (+)
 */
public class AddOperation implements IOperation {

    @Override
    public String getOperation() {
        return "add";
    }

    @Override
    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.add(newValue);
    }
}
