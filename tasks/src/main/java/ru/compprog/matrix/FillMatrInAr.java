package ru.compprog.matrix;

import java.util.Random;

/**
 * Write matrix to array;
 */
public class FillMatrInAr {

  public static void main(String[] args) {
    int row = 3;
    int col = 4;
    int[][] matrix = new int[row][col];
    int[] array = new int[row*col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = new Random().nextInt(20);
      }
    }
    int k = 0;
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        array[k] = matrix[j][i];
        k++;
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
