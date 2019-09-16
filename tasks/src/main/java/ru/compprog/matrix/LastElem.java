package ru.compprog.matrix;

import java.util.Random;

/**
 * The last element of the matrix rows is the sum of previous elements of the row
 */
public class LastElem {

  public static void main(String[] args) {
    int[][] matrix = new int[5][4];
    int sum = 0;
    Random random = new Random();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (j == matrix[0].length - 1) {
          matrix[i][j] = sum;
        } else {
          matrix[i][j] = random.nextInt(9);
          sum = sum + matrix[i][j];
        }
      }

    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }

  }
}
