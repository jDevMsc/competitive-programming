package ru.compprog.array;

import java.util.Arrays;

/**
 * Define indices of even elements of an array
 */
public class DefIndOfEven {

  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 4, 8, 1, 3, 7};
    int[] result = new int[10];
    int len = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        result[len] = i;
        len++;
      }
    }
    System.out.println(Arrays.toString(result));

  }

}
