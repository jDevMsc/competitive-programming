package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prove that for the set of positive integers 1+2+...+n = n(n+1)/2
 */
public class SetNaturNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    int sum2 = num * (num + 1) / 2;
    System.out.println(sum + " " + sum2);
  }

}
