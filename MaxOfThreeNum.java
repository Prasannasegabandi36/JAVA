public class MaxOfThreeNum {
    public static void main(String args[]){
        int num1=30,num2=20,num3=40,max;
        max=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("Maximum of"+num1+","+num2+","+num3+" is: " +max);
    }
    
}
