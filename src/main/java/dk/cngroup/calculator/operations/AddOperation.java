package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

public class AddOperation implements IOperation {

    public String getOperation() {
        return "add";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return currentValue.add(newValue);
    }
}
