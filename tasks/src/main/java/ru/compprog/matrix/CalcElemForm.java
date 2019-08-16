package ru.compprog.matrix;

/**
 * Calculate the elements of the matrix by the formula
 */
public class CalcElemForm {

  public static void main(String[] args) {
    double[][] matrix = new double[3][4];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = Math.sin(3*(i+1)+4*(j+1));
        if(matrix[i][j]<0) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println(matrix[i][j]);
      }
    }
  }

}
