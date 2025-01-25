import java.util.Arrays;
import java.util.Scanner;
public class KthMinElement {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num of elem:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elem of array:");
        for(int i = 0; i<n;i++){
            array[i]=scanner.nextInt();
        }
        int k;
        while(true){
            System.out.println("Enter the k values:");
            k=scanner.nextInt();
            if(k>0 && k<=n){
                break;
            } else {
                System.out.println("Invalid value of k");
            }
        }
        Arrays.sort(array);
        System.out.println("The"+k+"-th min ele is:" +array[k-1]);
        scanner.close();
    }
    
}
