package dk.cngroup.calculator.operations;

import dk.cngroup.calculator.exception.IllegalDataException;

import java.math.BigDecimal;

public interface IOperation {

    String getOperation();

    BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) throws IllegalDataException;
}
