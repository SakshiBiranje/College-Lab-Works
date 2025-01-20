import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = Math.max(a,b);
        System.out.println("maximum value : "+ c);
    }
}
