import java.util.*;

public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b=0;
        System.out.println("Enter the first value : ");
        if(sc.hasNextDouble() && !sc.hasNextInt()){
          
             a = sc.nextDouble();  
            
        }
        System.out.println("Not double value error");
        
        System.out.println("Enter the second value : ");
        if(sc.hasNextDouble() && !sc.hasNextInt()){
             b = sc.nextDouble(); 
        }
        System.out.println("Not double value error");
           
        double avg = (a+ b)/2;
        System.out.println("Average : "+ avg);

    } 
}
