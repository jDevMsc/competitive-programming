package ru.compprog.array;

import java.util.Arrays;

/**
 * Bubble Sort
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] array = {1, 3, 6, 2, 76, 8};
    System.out.println(Arrays.toString(array));

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j+1]) {
          int temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
