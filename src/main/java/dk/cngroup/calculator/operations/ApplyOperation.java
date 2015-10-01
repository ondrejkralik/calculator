package dk.cngroup.calculator.operations;

import java.math.BigDecimal;

/**
 * Created by okralik on 2. 10. 2015.
 */
public class ApplyOperation implements IOperation {

    public String getOperation() {
        return "apply";
    }

    public BigDecimal calculate(BigDecimal currentValue, BigDecimal newValue) {
        return newValue;
    }
}
