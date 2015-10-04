package dk.cngroup.calculator.datasource;

import dk.cngroup.calculator.exception.DataSourceNotFoundException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * DataSource implementing input which is stored in file.
 */
public class FileDataSource implements IDataSource {

    private String inputFilePath;

    /**
     * Constructor.
     * @param inputFilePath path to the input file
     */
    public FileDataSource(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    @Override
    public String getContent() throws DataSourceNotFoundException {

        if (!inputFileExists()) {
            throw new DataSourceNotFoundException("Input file '" + inputFilePath + "' does not exist.");
        }

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append(LINE_SEPARATOR);
            }

            return sb.toString();

        } catch (IOException e) {
            System.err.println("ERROR: Can't open file " + inputFilePath);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }


    /**
     * Checks wheather input file exists
     * @return true if file exists
     */
    private boolean inputFileExists() {
        return new File(inputFilePath).isFile();
    }
}
