package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Represent a natural number as prime factors
 */
public class NumFactors {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    int result = 1;

    while (num > 1) {
      int div = 2;
      while (true) {
        if (num % div == 0) {
          System.out.print(div + " ");
          result = result * div;
          num /= div;
          break;
        } else {
          div += 1;
        }
      }
    }
    System.out.println("\nНачальное число должно равняться " + result);

  }
}
