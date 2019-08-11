package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumMultDig {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      int dig = Integer.parseInt(reader.readLine());
      int sum = 0;
      int mult = 1;
      while (dig > 0) {
        if (dig != 0) {
          sum += dig % 10;
          mult *= dig % 10;
          dig = dig / 10;
        }
      }
      System.out.println("Сумма цифр введенного числа = " + sum);
      System.out.println("Проихведение цифр введенного числа = " + mult);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
