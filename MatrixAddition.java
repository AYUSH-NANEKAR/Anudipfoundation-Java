import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare 2D arrays using wrapper class Integer
        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];
        Integer[][] sumMatrix = new Integer[rows][cols];

        // Input elements for matrix1
        System.out.println("\nEnter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for matrix2
        System.out.println("\nEnter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("\nResultant Matrix (Sum):");
        for (Integer[] row : sumMatrix) {
            for (Integer value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}