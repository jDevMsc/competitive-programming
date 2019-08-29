package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Display as many elements of the Fibonacci as the user dpecified
 */
public class Fibonacci {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int fibNum = Integer.parseInt(reader.readLine());
    int first = 0;
    int second = 1;

    for (int i = 0; i < fibNum; i++) {
      int sum = first + second;
      System.out.print(sum + " ");
      first = second;
      second = sum;
    }
  }
}
