package dk.cngroup.calculator.parser;

import java.util.List;

/**
 * Parser interface
 */
public interface IParser {

    /**
     * Parses input into list of {@link Order} objects
     *
     * @param input input string with text orders separated with {@link dk.cngroup.calculator.datasource.IDataSource#LINE_SEPARATOR}
     * @return list of orders
     */
    List<Order> parse(String input);
}
