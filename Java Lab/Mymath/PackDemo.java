import MyMath.Arithmetic;
import MyMath.Stat;
import MyMath.Trig;
import java.util.Scanner;

public class PackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trigonometric operations
        System.out.print("Enter an angle in degrees for trigonometric calculations: ");
        double angle = scanner.nextDouble();
        Trig trig = new Trig(angle);
        System.out.println("Sine: " + trig.getSine());
        System.out.println("Cosine: " + trig.getCosine());
        System.out.println("Tangent: " + trig.getTangent());
        System.out.println("Secant: " + trig.getSecant());
        System.out.println("Cosecant: " + trig.getCosecant());
        System.out.println("Cotangent: " + trig.getCotangent());

        // Arithmetic operations
        System.out.print("Enter two float values for arithmetic operations:\nFirst value: ");
        float a = scanner.nextFloat();
        System.out.print("Second value: ");
        float b = scanner.nextFloat();
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition: " + arithmetic.add(a, b));
        System.out.println("Subtraction: " + arithmetic.subtract(a, b));
        System.out.println("Multiplication: " + arithmetic.multiply(a, b));
        System.out.println("Division: " + arithmetic.divide(a, b));

        // Statistical operations
        System.out.print("Enter the number of data points for statistical calculations: ");
        int count = scanner.nextInt();
        
        float[] data = new float[count];
        System.out.println("Enter the data points:");
        for (int i = 0; i < count; i++) {
            data[i] = scanner.nextFloat();
        }

        Stat stat = new Stat(data);
        System.out.println("Min: " + stat.min());
        System.out.println("Max: " + stat.max());
        System.out.println("Count: " + stat.count());
        System.out.println("Sum: " + stat.sum());
        System.out.println("Average: " + stat.average());

        scanner.close();
    }
}
