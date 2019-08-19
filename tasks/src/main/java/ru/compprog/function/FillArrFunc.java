package ru.compprog.function;

import java.util.Arrays;
import java.util.Random;

/**
 *  The function of filling  an array with random numbers
 */
public class FillArrFunc {
  public static void main(String[] args) {
    int[] array = new int[10];
    int start = 5;
    int end = 11;

    func(start, end, array);
    System.out.println(Arrays.toString(array));

  }

  static void func(int start, int end, int[] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = start + random.nextInt(end-start +1);
    }
  }


}
