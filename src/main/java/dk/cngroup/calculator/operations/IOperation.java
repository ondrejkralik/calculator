package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

public interface IOperation {

    String getOperation();

    BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue);
}
