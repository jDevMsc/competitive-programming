package ru.compprog.matrix;

/**
 * Swap matrix columns
 */
public class SwapMatrCol {

  public static void main(String[] args) {
    int[][] matrix = {
        {7, 5, 3, 85},
        {22, 7, 33, 36},
        {78, 2, -3, 45}
    };

    int numColF = 0;
    int numColS = 2;
    int temp;

    for (int i = 0; i < matrix.length; i++) {
      temp = matrix[i][numColF];
      matrix[i][numColF] = matrix[i][numColS];
      matrix[i][numColS] = temp;
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.printf("%4d",matrix[i][j]);
      }
      System.out.println();
    }

  }
}
