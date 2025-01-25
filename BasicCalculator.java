import java.util.Scanner;
public class BasicCalculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double result = scanner.nextDwouble();
        while(true){
            System.out.print("Enter operator(+,-,*,/)or 'exist' to stop");
            String operator=scanner.next();
            if(operator.equals("exist")){
                System.out.println("Exiting calculator");
                break;
            }
            System.out.println("Enter the number:");
            double operand=scanner.nextDouble();
            if(operand < 0) {
                System.out.println("Negitive number");
                break;
            }
            switch(operator){
                case "+":
                result += operand;
                break;
                case "-":
                result -= operand;
                break;
                case "*":
                result *= operand;
                break;
                case "/":
                if(operand !=0){
                    result /= operand;

                }else {
                    System.out.println("cannot divide");
                    continue;
                }
                break;
              default:
                System.out.println("invalid operator");
                continue;
            }
            System.out.println("current result"+result);
        }
        scanner.close();
    }
    
}
