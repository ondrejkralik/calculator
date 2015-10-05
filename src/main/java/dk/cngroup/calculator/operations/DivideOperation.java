package dk.cngroup.calculator.operations;

import dk.cngroup.calculator.exception.IllegalDataException;

import java.math.BigDecimal;

/**
 * Divide operation (/)
 */
public class DivideOperation implements IOperation {

    public String getOperation() {
        return "divide";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) throws IllegalDataException {

        if (BigDecimal.ZERO.equals(newValue)) {
            throw new IllegalDataException("Can not divide by zero.");
        }

        return currentValue.divide(newValue);
    }
}
