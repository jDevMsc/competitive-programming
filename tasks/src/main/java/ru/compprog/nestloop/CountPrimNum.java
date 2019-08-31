package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculate how many prime are among these.
 */
public class CountPrimNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int prime = 10;

    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(reader.readLine());
      for (int j = 2; j <num ; j++) {
        if(num%j==0) {
          prime--;
          break;
        }
      }
    }
    System.out.println("Простых чисел из всех введнеых = "  + prime);
  }
}
