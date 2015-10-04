package dk.cngroup.calculator;

import dk.cngroup.calculator.datasource.FileDataSource;
import dk.cngroup.calculator.datasource.IDataSource;
import dk.cngroup.calculator.operations.AddOperation;
import dk.cngroup.calculator.operations.ApplyOperation;
import dk.cngroup.calculator.operations.DivideOperation;
import dk.cngroup.calculator.operations.MultiplyOperation;
import dk.cngroup.calculator.operations.SubtractOperation;
import dk.cngroup.calculator.parser.FileParser;
import dk.cngroup.calculator.parser.IParser;

import java.math.BigDecimal;

/**
 * Main application
 */
public class App {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: First parameter have to be path to file with orders.");
            return;
        }

        IParser parser = new FileParser();

        OperationsRegister register = new OperationsRegister();
        register.register(new AddOperation());
        register.register(new ApplyOperation());
        register.register(new DivideOperation());
        register.register(new MultiplyOperation());
        register.register(new SubtractOperation());

        IDataSource dataSource = new FileDataSource(args[0]);

        Calculator calculator = new Calculator(register, parser, dataSource);
        BigDecimal result = calculator.calculate();

        if (result != null) {
            System.out.print(result);
        }
    }
}
