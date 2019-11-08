package ru.compprog.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Calculate the sumRecursive of the elements of the main or side diagonal
 * of the matrix depending on the user's choice
 */
public class SumDiagMatrix {

  public static void main(String[] args) throws IOException {
    int[][] matrix = new int[4][4];
    fillMatrix(matrix);
    printMatrix(matrix);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int choice = Integer.parseInt(reader.readLine());
    System.out.println(sumOfDiagonals(matrix, choice));
  }

   static void fillMatrix(int[][] matrix) {
    Random random = new Random();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = random.nextInt(20);
      }
    }
  }

  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }
  }

  static int sumOfDiagonals(int[][] matrix,int choice) {
    int result = 0;

    if(choice == 1) {
      for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];
      }
    } else if(choice == 2) {
      for (int i = 0; i < matrix.length; i++) {
        result += matrix[i][matrix.length - 1 -i];
      }
    }



  return result;
  }




}
