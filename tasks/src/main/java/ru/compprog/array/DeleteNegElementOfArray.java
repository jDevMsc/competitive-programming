package ru.compprog.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Removing negative array elements
 */
public class DeleteNegElementOfArray {

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = -5 + random.nextInt(5 + 5 + 1);
    }
    System.out.println(Arrays.toString(array));

    int lengthAr = 10;

    for (int i = 0; i < lengthAr; ) {
      if (array[i] < 0) {
        lengthAr -= 1;
        for (int j = i; j < lengthAr; j++) {
          array[j] = array[j + 1];
        }
      } else {
        i++;
      }
    }

    for (int j = 0; j < lengthAr; j++) {
      System.out.print(array[j] + " ");
    }
  }
}
