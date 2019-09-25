package ru.compprog.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nodTwoNumberF {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int inputFirst;
    int inputSecond;
    for (int i = 0; i < 4; i++) {
      System.out.println("Введите два числа");
      inputFirst = Integer.parseInt(reader.readLine());
      inputSecond = Integer.parseInt(reader.readLine());
      nod(inputFirst, inputSecond);
    }
  }

  static void nod(int c, int d) {

    while (c != 0 && d != 0) {
      if (c > d) {
        c = c % d;
      }else {
        d = d % c;
      }
    }
    System.out.println(c + d);

  }
}
