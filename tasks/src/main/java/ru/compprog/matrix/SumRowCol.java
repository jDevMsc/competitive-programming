package ru.compprog.matrix;

import java.util.Arrays;

/**
 * sum of  rows and  columns of a  matrix
 */
public class SumRowCol {

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                       {9, 10, 11, 12}};

    int[] colArray = new int[matrix[0].length];

    int sumRow = 0;
    int sumCol = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "  ");
        sumRow += matrix[i][j];
        colArray[j] += matrix[i][j];
      }
      System.out.print(sumRow + "\n");
    }
    System.out.println(Arrays.toString(colArray));

  }

}
