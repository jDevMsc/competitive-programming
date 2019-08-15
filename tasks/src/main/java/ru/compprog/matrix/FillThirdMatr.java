package ru.compprog.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Filling the third matrix according to the results
 * of comparing the element of the first two
 */
public class FillThirdMatr {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[][] first = new int[3][4];
    int[][] second = new int[3][4];
    int[][] third = new int[3][4];


    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        first[i][j] = Integer.parseInt(reader.readLine());
        second[i][j] = Integer.parseInt(reader.readLine());
        if(first[i][j]>second[i][j]) {
          third[i][j] = first[i][j];
        } else {
          third[i][j] = second[i][j];
        }
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println(third[i][j]);
      }
    }


  }

}
