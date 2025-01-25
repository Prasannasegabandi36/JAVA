import java.util.Scanner;
public class BinaryRepresentation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if(num ==0){
            System.out.println("Binary: 0");
        } else {
            String binary = "";
            int number = num < 0 ? -num:num;
            while(number > 0){
                binary = (number % 2) + binary;
                number = number / 2;
            }
            if (num < 0){
                binary = "-"+binary;
            }
            System.out.println("Binary: " +binary);
        }
        scanner.close();
    }
    
}
