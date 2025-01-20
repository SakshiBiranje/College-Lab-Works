class Complex {
    private double real;
    private double imag;

    public void init(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void display() {
        System.out.println("Complex number: " + real + " + " + imag + "i");
    }
}

public class Program4 {
    public static void main(String[] args) {
      
            double real = Double.parseDouble(args[0]);
            double imag = Double.parseDouble(args[1]);

            Complex c = new Complex();
            c.init(real , imag); // give values while compilng using terminal
            // javac Program4.java
            // java Program4 5 7
            // o/p : 5.0 + 7.0 i
            c.display();
        }
    }


