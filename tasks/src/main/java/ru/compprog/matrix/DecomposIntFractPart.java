package ru.compprog.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Decomposition of the integer and fractional parts of real numbers in matrix cells
 */
public class DecomposIntFractPart {

  public static void main(String[] args) throws IOException {
    int[][] matrix = new int[5][3];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float num;

    for (int i = 0; i < matrix.length; i++) {
      num = Float.parseFloat(reader.readLine());

      matrix[i][0] = (int) num;

      float temp = (num - (int)num)*100000;
      matrix[i][1] = Math.abs((int)temp);

      matrix[i][2] = num > 0 ? 0 : 1;
    }


  }
}
