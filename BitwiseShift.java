import java.util.Scanner;
public class BitwiseShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int  num  = scanner.nextInt();
        int leftshift  = num << 1;
        int rightshift = num >> 1;
        System.out.println("Leftshift by 1 " +leftshift);
        System.out.println("Rightshift by 1 " +rightshift);
        scanner.close();
    }
    
}
