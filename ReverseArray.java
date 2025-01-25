
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements in array:");
        int n=scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter ele of the array:");
        for(int i = 0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        reverseArray(array);
        System.out.println("Reversed Array:");
        for(int i = 0;i<n;i++){
            System.out.println(array[i]+" ");

        }
        scanner.close();
    
}
public static void reverseArray(int[] array){
    int left=0;
    int right=array.length-1;
    while(left<right){
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
        left++;
        right--;
    }
  }
}
