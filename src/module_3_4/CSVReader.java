package module_3_4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;

public class CSVReader {
    public static void main(String[] args) {
        double totalTemp = 0;
        int days = 0;

        try {
            URL url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            InputStream input = url.openStream();
            InputStreamReader inputReader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(inputReader);

            String line;
            int tempIndex = -1;

            line = reader.readLine();

            String[] headers = line.split(";");

            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals("UlkoTalo")) {
                    tempIndex = i;
                    break;
                }
            }

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                if (parts[0].startsWith("01.01.2023")) {
                    String temp = parts[tempIndex].replace(",", ".");
                    totalTemp += Double.parseDouble(temp);
                    days++;
                }
            }

            reader.close();

            System.out.println("The average temperature for the 1st day of January 2023: " + (totalTemp / days));

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}