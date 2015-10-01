package dk.cngroup.calculator;

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

        IParser parser = new FileParser();

        OperationsRegister register = new OperationsRegister();
        register.register(new AddOperation());
        register.register(new ApplyOperation());
        register.register(new DivideOperation());
        register.register(new MultiplyOperation());
        register.register(new SubtractOperation());

        Calculator calculator = new Calculator(register, parser);
        BigDecimal result = calculator.calculate(args[0]);

        System.out.print(result);
    }
}
