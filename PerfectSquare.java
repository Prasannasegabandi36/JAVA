 /*import java.util.Scanner;
public class PerfectSqaure {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number 1 and 500: ");
        int num = scanner.nextInt();
        if(num<1 || num>500) {
            System.out.println("Number is out of range ");

        }else{
            if(PerfectSquare(num)) {
                System.out.println(num + " is a perfect sqaure");

            } else {
                System.out.println(num +" is not a perfect square.");
            }
        }

            
    }
    scanner.close();
    
}
public static boolean isPerfectSqaure(int num){
    int low = 1;
    int high = num;
    while(low<=high) {
        int  mid = low + (high-low) /2;
        int sqaure = mid * mid;
        if(square == num){
            return num;
        }else if(square < num){
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        return false;
    }
}
*/
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 500: ");
        int num = scanner.nextInt();

        // Check if the number is in the valid range
        if (num < 1 || num > 500) {
            System.out.println("Number is out of range.");
        } else {
            // Call the binary search method to check if it's a perfect square
            if (isPerfectSquare(num)) {
                System.out.println(num + " is a perfect square.");
            } else {
                System.out.println(num + " is not a perfect square.");
            }
        }

        scanner.close();
    }

    // Method to check if a number is a perfect square using binary search
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int square = mid * mid;

            if (square == num) {
                return true;  // Found the perfect square
            } else if (square < num) {
                low = mid + 1;  // Look on the right side
            } else {
                high = mid - 1;  // Look on the left side
            }
        }

        return false;  // No perfect square found
    }
}
