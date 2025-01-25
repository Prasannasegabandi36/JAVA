import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int originalNumber = number;
        int reversedNumber = 0;
        while(number != 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if(originalNumber==reversedNumber){
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        
    }
    
}
