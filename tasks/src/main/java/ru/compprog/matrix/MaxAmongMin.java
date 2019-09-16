package ru.compprog.matrix;

import java.util.Random;

/**
 * The Max element among  thew min elements of the matrix columns
 */
public class MaxAmongMin {

  public static void main(String[] args) {
    int[][] matrix = new int[3][3];
    int maxMin = -1;
    Random random = new Random();


    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
          matrix[i][j] = random.nextInt(20);
      }
    }

    for (int j = 0; j < matrix.length; j++) {
      int min = 21;
      for (int i = 0; i < matrix.length; i++) {
      if(matrix[i][j] < min) {
        min = matrix[i][j];
        }
      }
      if(min > maxMin) {
        maxMin = min;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }

    System.out.println("Максимальный элемент среди минимальных = " + maxMin);

  }
}
