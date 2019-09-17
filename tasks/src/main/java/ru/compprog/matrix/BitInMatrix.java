package ru.compprog.matrix;

import java.util.Random;

/**
 * Writing into the matrix of results of bitwise opertions
 */
public class BitInMatrix {

  public static void main(String[] args) {
    int[][] matrix = new int[4][8];
    Random random = new Random();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {

        if (i < 2) {
          matrix[i][j] = random.nextInt(1 + 1);
          System.out.print(matrix[i][j] + "   ");
        } else if (i == 2) {
          matrix[i][j] = matrix[i - 1][j] & matrix[i - 2][j];
          System.out.print(matrix[i][j] + "   ");

        } else if (i == 3) {
          matrix[i][j] = matrix[i - 2][j] | matrix[i - 3][j];
          System.out.print(matrix[i][j] + "   ");
        }
      }
      System.out.println();
    }
  }
}
