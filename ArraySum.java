class ArraySum {
    // Method to calculate the sum of all elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {  // Enhanced for loop to iterate through the array
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Defining an integer array
        int[] numbers = {450, 520, 6530, 240, 2250};

        // Calling the method and storing the result
        int totalSum = calculateSum(numbers);

        // Displaying the sum
        System.out.println("The sum of the array elements is: " + totalSum);
    }
}
