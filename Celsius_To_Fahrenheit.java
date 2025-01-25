import java.util.Scanner;
public class CelsiusToFahrenheit {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit=(celsius * 9/5) + 32;
        System.out.println(celsius+" celsius is equal to"+ fahrenheit +" Farhenheit");
        scanner.close();
    }
}
