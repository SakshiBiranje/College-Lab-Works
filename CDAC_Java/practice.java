/*data types- 1. linear = arrays, arraylist , stack , queue etc.
                2. nonlinear = strings, hash table , tree, graph etc

*/
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Araay reversal : ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int num : arr)
            {
                sum += num;
            }
            System.out.println("Sum : "+ sum);
            Arrays.sort(arr);
            System.out.println("Sorted array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("Min value : "+arr[0]);
            System.out.println("Max value : "+arr[n-1]);

    }
}
