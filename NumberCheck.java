import java.util.Scanner;
public class NumberCheck {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String result = (num>0)? "Positive":(num<0)?"Negitive":"Zero";
        System.out.println("The num is "+result);
        scanner.close();
    }
}
