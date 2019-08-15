package ru.compprog.matrix;

import java.util.Random;

public class NumTwoDigNum {

  public static void main(String[] args) {
    int count = 0;
    int[][] matrix = new int[100][10];
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 10; j++) {
        matrix[i][j] = random.nextInt(100);
        if(matrix[i][j] >= 10 && matrix[i][j]<=99) {
          count++;
        }
      }
    }
    System.out.println("Количество двух значных цифр в массиве = " + count);

  }
}
