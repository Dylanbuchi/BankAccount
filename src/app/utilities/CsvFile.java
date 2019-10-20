package app.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * CsvFile
 */
public class CsvFile {

    // reads cvs File
    public static List<String[]> readCsvFile(String file) throws IOException {

        String dataRow = "";

        List<String[]> data = new LinkedList<String[]>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((dataRow = br.readLine()) != null) {

                String[] dataRowSplited = dataRow.split(",");

                data.add(dataRowSplited);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return data;

    }

}