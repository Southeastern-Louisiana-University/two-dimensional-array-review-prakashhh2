// starting point for class activities

import java.util.Random;

public class startPractice {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        initializeRandom(matrix);
        printMatrix(matrix);

        System.out.println("Total Sum: " + sumAll(matrix));

        sumByColumn(matrix);

        findLargestRow(matrix);
    }


    public static void initializeRandom(int[][] matrix) {
        Random rand = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(100);
            }
        }
    }


    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }


    public static int sumAll(int[][] matrix) {
        int total = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                total += matrix[row][col];
            }
        }

        return total;
    }


    public static void sumByColumn(int[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) {

            int total = 0;

            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }

            System.out.println("Sum of column " + col + ": " + total);
        }
    }


    public static void findLargestRow(int[][] matrix) {

        int maxRow = 0;
        int maxSum = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            maxSum += matrix[0][col];
        }

        for (int row = 1; row < matrix.length; row++) {

            int currentSum = 0;

            for (int col = 0; col < matrix[row].length; col++) {
                currentSum += matrix[row][col];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxRow = row;
            }
        }

        System.out.println("Row with largest sum: " + maxRow);
        System.out.println("Largest row sum: " + maxSum);
    }
}

