package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SUM of elements of a series numbers
 * 1 -0.5 0.25 -0.125 ...
 */
public class SumElemSer {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int cycle = Integer.parseInt(reader.readLine());
    float first = 1;
    float sum = 0;

    for (int i = 0; i < cycle; i++) {
      sum += first;
      first /= -2;
    }

    System.out.printf("Сумма ряда равна = %.5f", sum);
  }
}
