package ru.compprog.matrix;

/**
 * Find  the ьштшьгь  штвусуы  of  matrix elements
 */

public class IndMinElem {

  public static void main(String[] args) {
    int[][] matrix = {{22,2,1},{4,1,6},{17,8,1}};

    int min = matrix[0][0];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] < min ) {
          min = matrix[i][j];

        }
     }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] == min ) {
          System.out.println("Строка: " + i + " Колонка: " + j);

        }
      }
    }
  }
}
