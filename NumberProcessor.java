import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try {
            // Read numbers from input file
            Scanner scanner = new Scanner(new File(inputFile));
            scanner.useDelimiter(","); // Use comma as delimiter
            
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                } else {
                    scanner.next(); // Skip invalid entries
                }
            }
            scanner.close();
            
            // Determine the highest number
            if (numbers.isEmpty()) {
                System.out.println("No valid numbers found in input file.");
                return;
            }
            
            int highestNumber = Collections.max(numbers);
            
            // Prepare results
            List<String> results = new ArrayList<>();
            for (int num : numbers) {
                int sum = (num * (num + 1)) / 2; // Sum of natural numbers formula
                results.add(num + ", " + sum);
            }
            results.add("Highest Number: " + highestNumber);
            
            // Write results to output file
            PrintWriter writer = new PrintWriter(new File(outputFile));
            for (String result : results) {
                writer.println(result);
            }
            writer.close();
            
            System.out.println("Processing complete. Check " + outputFile + " for results.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        }
    }
}