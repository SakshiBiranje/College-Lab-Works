import java.io.*;
import java.util.Scanner;

class StudentInfo {
    private String name;
    private int age;
    private String rollNumber;

    // Method to get student details from user
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        // Loop until valid age is entered
        while (true) {
            System.out.print("Enter student age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age > 0) break; // Ensure age is positive
                else System.out.println("Age must be positive.");
            } else {
                System.out.println("Please enter a valid integer for age.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.print("Enter roll number: ");
        rollNumber = scanner.next();
    }

    // Method to write student details to a file
    public void writeToFile() {
        try (FileOutputStream fos = new FileOutputStream("student_info.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeUTF(rollNumber);
            System.out.println("Student details written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read student details from a file
    public void readFromFile() {
        try (FileInputStream fis = new FileInputStream("student_info.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            String name = dis.readUTF();
            int age = dis.readInt();
            String rollNumber = dis.readUTF();
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure the file exists.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentInfo student = new StudentInfo();
        student.getDetails(); // Get student details from user
        student.writeToFile(); // Write student details to file
        student.readFromFile(); // Read student details from file
    }
}
