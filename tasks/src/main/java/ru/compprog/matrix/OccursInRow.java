package ru.compprog.matrix;

import java.util.Random;

public class OccursInRow {

  public static void main(String[] args) {
    int[][] matrix = new int[10][20];
    Random random = new Random();
    int count = 0;
    int[] rows = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
         matrix[i][j] = random.nextInt(5 + 1);
         if(matrix[i][j]  == 5) {
           count++;
         }

        System.out.printf( "%3d",matrix[i][j]);
      }
      if(count  > 2) {
        rows[i] = count;
      }
      count = 0;
      System.out.println();
    }
    System.out.print("Номер строк  с 5-ой : " );

    for (int i = 0; i < rows.length; i++) {
      if(rows[i] >2 ) {
        System.out.print( i + " ");
      }
    }
  }
}
