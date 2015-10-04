package dk.cngroup.calculator.datasource;

import dk.cngroup.calculator.exception.DataSourceNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class FileDataSourceTest {

    @Test
    public void testGetContent() throws Exception {

        FileDataSource fileDataSource = new FileDataSource(getClass().getResource("/test1.txt").getFile());

        String expectedString =
                "add 2" + IDataSource.LINE_SEPARATOR +
                        "multiply 3" + IDataSource.LINE_SEPARATOR +
                        "apply 3" + IDataSource.LINE_SEPARATOR;

        Assert.assertEquals(expectedString, fileDataSource.getContent());
    }

    @Test(expected = DataSourceNotFoundException.class)
    public void testNonExistingFile() throws Exception {

        FileDataSource fileDataSource = new FileDataSource("/non_existing_file.txt");
        fileDataSource.getContent();

        Assert.fail("Exception wasn't thrown.");
    }
}
