import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first term(a):");
        int a = scanner.nextInt();
        System.out.println("Enter the common diff(d)):");
        int d = scanner.nextInt();
        System.out.println("Enter the number of term(n):");
        int n = scanner.nextInt();
        int sum = n*(2 * a+ (n-1)* d)/2;
        System.out.println("The sum of arthmetic progression is : "+sum);
        scanner.close();
        
    }
    
}
