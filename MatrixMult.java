import java.util.*;
import java.io.*;

public class MatrixMult {
    private static void disp(int r, int c, int matrix[][]) {

        for (int i = 0; i < r; i++) {
            System.out.print("|\t");
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("|");
        }
    }

    private static int[][] read(int r, int c) {
        int[][] matrix = new int[r][c];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] multiply(int r, int c, int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[r][c];
        int i, j, k;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                result[i][j] = 0;
                for (k = 0; k < c; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int r = scan.nextInt();
        System.out.print("Enter number of Cols: ");
        int c = scan.nextInt();

        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];

        System.out.println("Enter the values for martix :");
        System.out.println("Matrix1: ");
        matrix1 = read(r, c);
        System.out.println("Matrix2: ");
        matrix2 = read(r, c);

        System.out.println("Matrix1: ");
        disp(r, c, matrix1);
        System.out.println("Matrix2: ");
        disp(r, c, matrix2);

        int result[][] = new int[r][c];
        result = multiply(r, c, matrix1, matrix2);
        System.out.println("Result: ");
        disp(r, c, result);

        scan.close();
    }
}
