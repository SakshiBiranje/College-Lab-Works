//Write a program to implement matrix operations
import java.util.Scanner;

public class Experiment2
 {

    public static void main(String[] args) 
 {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < cols; j++) 
{
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < cols; j++) 
{
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix operations
        int[][] additionResult = addMatrices(matrix1, matrix2);
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2, rows, cols, cols);

        // Display results
        System.out.println("Matrix Addition:");
        displayMatrix(additionResult);

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractionResult);

        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplicationResult);
        scanner.close();
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) 
{
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < cols; j++) 
{
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) 
{
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
 {
            for (int j = 0; j < cols; j++) 
{
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2, int r1, int c1, int c2) 
{
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) 
{
            for (int j = 0; j < c2; j++) 
{
                for (int k = 0; k < c1; k++)
 {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) 
{
            for (int elem : row) 
{
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}