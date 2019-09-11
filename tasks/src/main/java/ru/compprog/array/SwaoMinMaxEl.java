package ru.compprog.array;

import java.util.Arrays;

/**
 * Swap the minimum and maximum elements
 */
public class SwaoMinMaxEl {

  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5};
    int minInd = 0;
    int maxInd = 0;
    int temp;

    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[minInd]) {
        minInd = i;
      } else if (array[i] > array[maxInd]) {
        maxInd = i;
      }
    }
    temp = array[maxInd];
    array[maxInd] = array[minInd];
    array[minInd] = temp;

    System.out.println(Arrays.toString(array));
  }
}
