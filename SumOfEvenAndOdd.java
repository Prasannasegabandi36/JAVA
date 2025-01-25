import java.util.Scanner;
public class SumOfEvenAndOdd {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first integerr: ");
        int start = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int end = scanner.nextInt();
        scanner.close();
        int evensum = 0;
        int oddsum =0;
        for (int i = start; i <= end; i++){
            if(i % 2 ==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }

        }
        System.out.println("The sum of even number: "+evensum);
        System.out.println("The sum of odd number: "+oddsum);
    }
    
}
