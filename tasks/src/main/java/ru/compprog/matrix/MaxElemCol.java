package ru.compprog.matrix;

import java.util.Arrays;
import java.util.Random;

/**
 * Find the max elements of the  matrix columns
 */
public class MaxElemCol {

  public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    int[] col = new int[matrix.length];
    Random random = new Random();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = random.nextInt(15);
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }

    for (int j = 0; j < matrix.length; j++) {
      int maxNum = -1;

      for (int i = 0; i < matrix[0].length; i++) {
          if(matrix[i][j] > maxNum) {
            maxNum =  matrix[i][j];
          }
      }
      col[j] = maxNum;
    }
    System.out.println("Максимальный элемент в каждом столбце = " + Arrays.toString(col));
  }
}
