package dk.cngroup.calculator.datasource;

import dk.cngroup.calculator.exception.DataSourceNotFoundException;

public interface IDataSource {

    /**
     * Separator of orders
     */
    static final String LINE_SEPARATOR = ";";

    /**
     * Method return content of datasource converted to String splitted with {@link #LINE_SEPARATOR}
     *
     * @return String splitted with {@link #LINE_SEPARATOR}
     * @throws DataSourceNotFoundException when dataSource is not found
     */
    String getContent() throws DataSourceNotFoundException;
}
