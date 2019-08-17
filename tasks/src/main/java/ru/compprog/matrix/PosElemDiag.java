package ru.compprog.matrix;

/**
 * POsitive elements of the main diagonal
 */

public class PosElemDiag {

  public static void main(String[] args) {
    int[][] matrix = {
        {7, 5, 3},
        {22, 7, 33},
        {78, 2, -3}
    };

    int sum = 0;

    for (int i = 0; i < matrix.length; i++) {
      if(matrix[i][i] > 0) {
        sum+=matrix[i][i];
      }
    }
    System.out.println(sum);
  }
}
