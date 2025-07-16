import java.util.*;
public class practice4 {
    // twoDArray
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
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
        System.out.println("Diagonal elements : ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j || (i+j) == 2){    // {(i+j)==2 bcoz 2= length-1}
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }

        System.out.println();
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j || (i+j) == 2){
                  
                    if(arr[i][j]%2 ==0){
                        even.add(arr[i][j]);
                    }
                    else{
                        odd.add(arr[i][j]);
                    }
                }
                
            }
        }
        System.out.println("Even diagonal elements : " + even);
        System.out.println("Odd diagonal elements : ");

    }
}
