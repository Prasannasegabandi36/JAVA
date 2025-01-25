import java.util.Scanner;
public class GravitionalForce {
    private static final double G = 6.674*Math.pow(10,-11);
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of first obj(m1 in kg):");
        double m1 = scanner.nextDouble();
        System.out.println("Enter the mass of second obj(m2 in kg):");
        double m2 = scanner.nextDouble();
        System.out.println("Enter the dis b/w obj(r in meters):");
        double r = scanner.nextDouble();
        double force = G * (m1 * m2) / Math.pow(r,2);
        System.out.println("The gravitional force b/w " +force+ "N");
        scanner.close();



    }
}