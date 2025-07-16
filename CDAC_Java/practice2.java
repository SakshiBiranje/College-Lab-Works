import java.util.*;
public class practice2 {
    public static int Pro(int[] arr){
        int pro=0;
        for(int i=0;i<arr.length-1;i++){
          if(arr[i+1] > arr[i]){
            pro += arr[i+1]-arr[i];

          }
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result = Pro(arr);
        System.out.println("Total profit : "+result);
    }
}
