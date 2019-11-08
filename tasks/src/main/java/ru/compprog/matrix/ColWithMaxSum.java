package ru.compprog.matrix;

import java.util.Random;

/**
 * Find the matrix column with the  maximum sumRecursive of element
 */
public class ColWithMaxSum {

  public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    Random random = new Random();
    int col = 0;
    int sum;
    int maxSum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = random.nextInt(15);
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }

    for (int i = 0; i < matrix.length; i++) {
      sum = 0;

      for (int j = 0; j < matrix[0].length; j++) {
        sum += matrix[j][i];
      }
      if(maxSum<sum) {
        maxSum = sum;
        col = i;
      }
    }
    System.out.println("Столбец с максимальной суммой = " + col);
  }
}
