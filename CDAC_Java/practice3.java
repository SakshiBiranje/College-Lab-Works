import java.util.*;
/*
 * total leetcode patterns : 
 * 1. sliding window
 * 2. cyclic sort
 * 3. reverse of linkedlist
 * 4. tree BFS
 * 5. tree DFS
 * 6.graph
 * 7.binary seach
 * 8. backtracking
 * 9. BFs - graph 
 * 10. dynamic programming 
 * 11. greedy algorithm 
 * 12. Dijistra algo
 * 13.disjoint set{Union}
 * 14.Bit manipulation
 * 15.two pointer approach 
 * 16.merge instances
 * 
 *  
 */
public class practice3 {
    // twoDArray
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] [] arr = new int[3][3];
        System.out.println("Enter array elements : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("2D array : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] +" ");
                 
            }
            System.out.println();
        }
        System.out.println("Array with its row sum : ");
        
        for(int i=0;i<3;i++){
            int rowsum=0;
            for(int j=0;j<3;j++){
                
                 rowsum = arr[i][j] + rowsum;
            }
            System.out.println("Sum of " + i +"th row : " +rowsum);
            
        }
         System.out.println("Array with its col sum : ");
        
        for(int i=0;i<3;i++){
            int colsum=0;
            for(int j=0;j<3;j++){
            
                 colsum = arr[j][i] + colsum;
            }
            System.out.println("Sum of " + i +"th column : "+colsum);
        }

    }



}
