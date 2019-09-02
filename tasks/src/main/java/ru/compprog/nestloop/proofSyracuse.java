package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Proof of the Syracuse Hypothesis
 */
public class proofSyracuse {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int lower = Integer.parseInt(reader.readLine());
    int upper = Integer.parseInt(reader.readLine());

    for (int i = lower; i <= upper; i++) {
      System.out.println("Число " + i);
      int num = i;
      while (num != 1) {
        if (num % 2 == 0) {
          num = num / 2;
        } else {
          num = (num * 3 + 1) / 2;
        }
      }
    }
    System.out.println("Гипотеза Сиракуза верна");
  }
}
