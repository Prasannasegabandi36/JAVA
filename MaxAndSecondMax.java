import java.util.Arrays;
public class MaxAndSecondMax {
    public static void main(String args[]){
        int[] arr = {12,3,56,1,4,2};
        findMaxAndSecondMax(arr);
    }
    public static void findMaxAndSecondMax(int[] arr){
        if(arr.length < 2){
            System.out.println("Array should have atleast two elements:");
            return;
        }
        int max=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax=max;
                max=num;
            } else if(num>secondMax && num!=max){
                secondMax=num;
            }
            if(secondMax==Integer.MIN_VALUE){
                System.out.println("There is no second MAx element");
            } else {
            System.out.println("Max ele:" +max);
            System.out.println("Second Maxele:"+secondmax);
        }
} 
}