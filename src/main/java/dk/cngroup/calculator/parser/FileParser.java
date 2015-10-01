package dk.cngroup.calculator.parser;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Parser for input in file
 */
public class FileParser implements IParser {

    /**
     * Parses input file and return list of parsed items(lines)
     *
     * @param inputFilePath path to input file
     * @return list of orders / null
     */
    public List<Order> parse(String inputFilePath) {
        List<Order> outputList = null;

        File file = new File(getClass().getResource(inputFilePath).getFile());
        try {
            Scanner scanner = new Scanner(file);
            outputList = new ArrayList<Order>();

            while (scanner.hasNextLine()) {
                String[] arr = scanner.nextLine().split(" ");
                outputList.add(new Order(arr[0], new BigDecimal(arr[1])));
            }
            scanner.close();

        } catch (IOException e) {
            System.err.println("ERROR: Can't open file " + inputFilePath);
        }

        // last order have to be processed as first -> last order will be moved to first position
        Order lastOrder = outputList.get(outputList.size() - 1);
        outputList.add(0, lastOrder);
        outputList.remove(outputList.size() - 1);

        return outputList;
    }
}
