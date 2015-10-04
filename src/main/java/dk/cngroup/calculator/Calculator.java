package dk.cngroup.calculator;

import dk.cngroup.calculator.datasource.IDataSource;
import dk.cngroup.calculator.exception.DataSourceNotFoundException;
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
    private IDataSource dataSource;

    /**
     * Constructor.
     *
     * @param register storage for operations
     * @param parser parser of orders/instructions
     * @param dataSource datasource with orders
     */
    public Calculator(OperationsRegister register, IParser parser, IDataSource dataSource) {
        this.register = register;
        this.parser = parser;
        this.dataSource = dataSource;
    }

    /**
     * Calculate result from input
     *
     * @return calculated result or null if some error occurs
     */
    public BigDecimal calculate() {

        String data = null;
        try {
            data = dataSource.getContent();
        } catch (DataSourceNotFoundException e) {
            System.err.println("ERROR: Input file not found.");
            return null;
        }
        List<Order> orders = parser.parse(data);

        BigDecimal currentValue = new BigDecimal("0");
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
