package dk.cngroup.calculator.parser;

import dk.cngroup.calculator.datasource.IDataSource;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FileParserTest {

    @Test
    public void testParse() throws Exception {
        FileParser fileParser = new FileParser();

        String inputString =
                "add 2" + IDataSource.LINE_SEPARATOR +
                "multiply 3" + IDataSource.LINE_SEPARATOR +
                "apply 3";

        List<Order> expectedList = new ArrayList<Order>();
        expectedList.add(new Order("apply", new BigDecimal("3")));
        expectedList.add(new Order("add", new BigDecimal("2")));
        expectedList.add(new Order("multiply", new BigDecimal("3")));

        Assert.assertEquals(expectedList, fileParser.parse(inputString));
    }
}
