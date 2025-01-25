import java.util.Scanner;
public class PrimeCheck {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void printFactors(int num){
        System.out.println("Factors of " +num+ " are: ");
        for(int i =1; i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number +" is a prime number.");

        } else {
            System.out.println(number +" is not a prime number.");
            printFactors(number);
        }
        scanner.close();

    }
    
}
