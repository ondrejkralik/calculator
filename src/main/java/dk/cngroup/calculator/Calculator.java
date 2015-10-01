package dk.cngroup.calculator;

import dk.cngroup.calculator.operations.IOperation;
import dk.cngroup.calculator.parser.IParser;
import dk.cngroup.calculator.parser.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 * Calculator application
 */
public class Calculator {

    private OperationsRegister register;
    private IParser parser;

    public Calculator(OperationsRegister register, IParser parser) {
        this.register = register;
        this.parser = parser;
    }

    public BigDecimal calculate(String source) {
        BigDecimal currentValue = new BigDecimal("0");
        List<Order> orders = parser.parse(source);

        if (orders != null) {
            for (Order order : orders) {
                IOperation operation = register.findOperation(order.getOrder());
                if (operation != null) {
                    currentValue = operation.calculate(currentValue, order.getNumber());
                }
            }
        }

        return currentValue;
    }
}
