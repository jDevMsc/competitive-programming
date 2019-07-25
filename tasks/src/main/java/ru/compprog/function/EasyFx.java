package ru.compprog.function;

import static java.lang.Math.abs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyFx {

  /**
   * function F(x)
   * @param args
   */
  public static void main(String[] args) {
    int y;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int x = Integer.parseInt(reader.readLine());
      if (x > 0) {
        y = 2 * x - 10;
      } else if (x == 0) {
        y = 0;
      } else {
        y = 2 * abs(x) -1;
      }
      System.out.println(y);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
