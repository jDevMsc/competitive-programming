package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Find the number with max sum of digits
 */

public class MaxSumDig {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите четыре числа");

    int number;
    int maxSum = 0;
    int maxNum = 0;

    for (int i = 0; i < 4; i++) {
      number = Integer.parseInt(reader.readLine());
      int locSum = 0;
      int dupl = number;

      while (dupl > 0) {
      locSum += dupl % 10;
        dupl /= 10;
    }

      if (locSum > maxSum) {
        maxSum = locSum;
        maxNum = number;
      }
    }
    System.out.println("Число " + maxNum + " имеет максимальную сумму чисел: " + maxSum);
  }
}
