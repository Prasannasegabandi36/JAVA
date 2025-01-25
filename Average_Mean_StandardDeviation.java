import java.util.Arrays;
import java.util.Scanner;

public class AveMeSD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the sequence
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create an array to store the integers
        int[] numbers = new int[n];
        
        // Input the integers
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate and display the average, median, and standard deviation
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Median: " + calculateMedian(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
        
        scanner.close();
    }

    // Method to calculate average
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);  // Sort the numbers
        int n = numbers.length;
        
        // If the length is even, return the average of the two middle elements
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];  // If odd, return the middle element
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] numbers) {
        double mean = calculateAverage(numbers);  // Get the average
        double sum = 0;
        
        // Calculate the variance
        for (int num : numbers) {
            sum += Math.pow(num - mean, 2);  // (x - mean)^2
        }
        
        double variance = sum / numbers.length;  // variance = sum of squared differences / number of elements
        return Math.sqrt(variance);  // Standard deviation = square root of variance
    }
}
