import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ReadNumbersFromFile {

    public static void main(String[] args) {
        // Specify the path of the file containing numbers
        String filePath = "C:/Users/Sree Isu/Documents/NetBeansProjects/JavaApplication1/src/tests.txt";

        try {
            // Read numbers from the file and check for positivity
            checkNumbersFromFile(filePath);
            System.out.println("All numbers are non-positive.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void checkNumbersFromFile(String filePath)
            throws IOException, PositiveNumberException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Ignore empty lines or lines with only whitespace
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] numbers = line.split("\\s+");
                for (String numberStr : numbers) {
                    // Ignore empty strings
                    if (numberStr.isEmpty()) {
                        continue;
                    }

                    int number = Integer.parseInt(numberStr);
                    if (number > 0) {
                        throw new PositiveNumberException("Positive number found: " + number);
                    }
                }
            }
        }
    }
}
