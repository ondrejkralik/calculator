package dk.cngroup.calculator.parser;

import dk.cngroup.calculator.datasource.IDataSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Parser for input in file
 */
public class FileParser implements IParser {

    /**
     * Parses input file and return list of parsed items(lines)
     *
     * @param input input data
     * @return list of orders
     */
    public List<Order> parse(String input) {

        String[] lines = input.split(IDataSource.LINE_SEPARATOR);

        List<Order> outputList = new ArrayList<Order>();
        for (int i=0; i < lines.length; i++) {
            String[] orderLine = lines[i].split(" ");
            if (orderLine.length == 2) {
                outputList.add(new Order(orderLine[0], new BigDecimal(orderLine[1])));
            }
        }

        // last order have to be processed as first -> last order will be moved to first position
        Order lastOrder = outputList.get(outputList.size() - 1);
        outputList.add(0, lastOrder);
        outputList.remove(outputList.size() - 1);

        return outputList;
    }
}
