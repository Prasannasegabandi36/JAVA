import java.util.Scanner;
public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer check if its even or odd: ");
        int num=scanner.nextInt();
        if((num & 1) == 0){
            System.out.println(num + " is even.");

        } else {
            System.out.println(num + "is odd.");
        }
        System.out.print("Enter the first integer for BO:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer for BO:");
        int num2 = scanner.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise AND of" +num1+ " and " +num2+ ":" +andResult);
        System.out.println("Bitwise OR of" +num1+ " and " +num2+ ":" +orResult);
        System.out.println("Bitwise XOR of" +num1+ " and " +num2+ ":" +xorResult);
        scanner.close();
    
    

    }
    
}
