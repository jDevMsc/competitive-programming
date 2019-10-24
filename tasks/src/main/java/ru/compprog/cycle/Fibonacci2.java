package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {

  public static void main(String[] args) throws IOException {
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int input = Integer.parseInt(reader.readLine());
    System.out.println(fibEffective(100));
    System.out.println(fibNaive(10));
  }

  private static long fibNaive(int n) {
    if(n <= 1) {
      return n;
    }

    return fibNaive(n-1) + fibNaive(n-2);
  }

  private static long fibEffective(int n) {
    long[] arr = new long[n+1];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i <= n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n];
  }
}
