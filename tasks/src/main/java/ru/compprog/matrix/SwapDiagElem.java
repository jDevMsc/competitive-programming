package ru.compprog.matrix;

import java.util.Random;

/**
 * Exchange of values of the main and secondary
 * diagonals of a square matrix
 */
public class SwapDiagElem {

  public static void main(String[] args) {
    int[][] matrix = new int[6][6];
    Random random = new Random();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = 10 + random.nextInt(30 - 10+1);
        System.out.print(matrix[i][j] + "   ");

      }
      System.out.println();

    }
    System.out.println("============================");

    if(matrix.length == matrix[0].length) {

      for (int i = 0; i < matrix.length; i++) {
        int temp = matrix[i][i];
        matrix[i][i] = matrix[i][matrix.length - 1 - i];
        matrix[i][matrix.length - 1 - i] = temp;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + "   ");
      }
      System.out.println();
    }




  }
}
