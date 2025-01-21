import java.util.*;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println("Output 1 :");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                System.out.print(arr[j][i] + " ");
            }
        }
        System.out.println();
        
        System.out.println("Output 2 :");
        zigzagSpiralTraversal(arr);
        
        System.out.println();
        System.out.println("Output 3 : ");
        for(int i=0;i<=4;i++){
            
                System.out.print(arr[i][i] + " ");
        }
        for(int i=0;i<=4;i++){
            
            System.out.print(arr[i][4-i] + " ");
    }
       
        
    }
    public static void zigzagSpiralTraversal(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        boolean leftToRight = true; 

        while(top <= bottom) {
            if(leftToRight) {
                for(int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
            } else{
                for(int i = right; i >= left; i--) {
                    System.out.print(arr[top][i] + " ");
                }
            }
            top++; 
            leftToRight = !leftToRight; 
        }

        while(right >= left) {
            
            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--; 

           
            for(int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++; 
        }
        }
    }
    
    


 
