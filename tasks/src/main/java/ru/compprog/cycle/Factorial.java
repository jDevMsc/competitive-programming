package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    int factorial = 1;

    for (int i = 1; i <= num; i++) {
      if (num == 0) {
        break;
      }
      factorial *= i;
    }
    System.out.println(factorial);
  }

}
