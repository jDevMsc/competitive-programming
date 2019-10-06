package ru.compprog.array;

import java.util.Arrays;

/**
 * Compress an array by deleting elements belonging to an interval
 */
public class CompressArrayDelEl {

  public static void main(String[] args) {
    int[] array = {5, 3, 2, 1, 9, 5};
    int start = 1;
    int end = 3;

    int length = 6;

    System.out.println(Arrays.toString(array));
    for (int i = 0; i < length; ) {
      if (array[i] >= start && array[i] <= end) {
        length--;
        for (int j = i; j < length; j++) {
          array[j] = array[j + 1];

        }
      } else {
        i++;
      }
    }

    for (int i = length; i < array.length; i++) {
      array[i] = 0;
    }
    System.out.println(Arrays.toString(array));


  }
}
