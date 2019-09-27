package ru.compprog.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *     5
 * s = ∑ (-1) * i * (x / i!)
 *    i=1
 */
public class rowFactorial {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float input = Float.parseFloat(reader.readLine());
    float s = 0;
    int j = 0;

    for (int i = 0; i < 5; i++) {
      j = factorial(i);
      s += (-1) * i * (input / j);
    }
    System.out.println(s);
  }

  static int factorial(int i) {
    int result = 1;
    for (int j = 2; j <= i; j++) {
      result *= j;
    }
    return result;
  }
}
