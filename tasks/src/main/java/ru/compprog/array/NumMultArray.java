package ru.compprog.array;

import java.util.Arrays;

/**
 * The number of multiple numbers from 2 to 99 numbers from 2 to 9
 */
public class NumMultArray {

  public static void main(String[] args) {
    int[] arrayMult = new int[8];
    for (int i = 2; i < 99; i++) {
      for (int j = 2; j < 10; j++) {
        if (i % j == 0) {
          arrayMult[j-2]++;
        }
      }
    }
    System.out.println(Arrays.toString(arrayMult));
  }
}
