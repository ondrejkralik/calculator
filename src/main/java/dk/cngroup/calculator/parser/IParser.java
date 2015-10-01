package dk.cngroup.calculator.parser;

import java.util.List;

/**
 * Parser interface
 */
public interface IParser {

    List<Order> parse(String input);
}
