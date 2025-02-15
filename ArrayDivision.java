import java.util.Scanner;

public class ArrayDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size n (must be > 20)
        System.out.print("Enter size of first array (n > 20): ");
        int n = scanner.nextInt();
        if (n <= 20) {
            System.out.println("n must be greater than 20!");
            return;
        }

        // Calculate second array size
        int m = (int) Math.ceil(n / 10.0); // Ceiling division for size
        System.out.println("Size of second array: " + m);

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        // Input first array
        System.out.println("Enter " + n + " elements for first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.println("Enter " + m + " elements for second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
            if (arr2[i] == 0) { // Avoid division by zero
                System.out.println("Elements in the second array cannot be zero.");
                return;
            }
        }

        // Compute quotient and remainder
        System.out.println("\nResults (Quotient & Remainder):");
        for (int i = 0; i < n; i++) {
            int divisor = arr2[i % m]; // Wrap around index
            int quotient = (int) Math.ceil((double) arr1[i] / divisor);
            int remainder = arr1[i] % divisor;

            System.out.println("arr1[" + i + "] / arr2[" + (i % m) + "] = " +
                    quotient + " (remainder: " + remainder + ")");
        }

        scanner.close();
    }
}
