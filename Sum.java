public class Sum {
    public static void main(String args[]){
        int arr[]={2,3,4};
        int n = arr.length;
        int sum=arr[0];
        for(int i =0;i<n;i++){
            sum=arr[i]+sum;
        }
        System.out.println("Sum is:"+sum);
    }
    
}
