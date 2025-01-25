public class PrintNum {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        System.out.println(i);
    }
}

import java.util.Scanner;

public class PrimeChecker {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Prime numbers are greater than 1
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to square root of the number
            if (num % i == 0) return false; // If divisible, not prime
        }
        return true;
    }

    // Method to print factors of a number
    public static void printFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // Check if 'i' is a factor
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For new line after printing factors
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            printFactors(number); // Print factors if not prime
        }

        scanner.close();
    }
}
