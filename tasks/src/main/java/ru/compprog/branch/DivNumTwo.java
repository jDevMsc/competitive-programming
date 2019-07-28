package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Checking the divisibility of the first number to the second
 */

public class DivNumTwo {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());

    if (a % b == 0) {
      System.out.println("Первое число делится на второе");
      System.out.println("Частное = " + (double)a / b);
    } else {
      System.out.println("Первое число делится не на второе");
      System.out.println("Частное = " + (double)a / b);
    }


  }

}
