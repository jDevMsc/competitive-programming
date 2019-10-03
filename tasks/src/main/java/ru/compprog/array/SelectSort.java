package ru.compprog.array;

import java.util.Arrays;

public class SelectSort {

  public static void main(String[] args) {
    int[] array = {1, 3, 6, 2, 76, 8};
    System.out.println(Arrays.toString(array));

    for (int i = 0; i < array.length; i++) {
      int min = array[i];
      int minInd = i;
      for (int j = i; j < array.length ; j++) {
        if(array[j] < min) {
          min = array[j];
          minInd = j;
        }
      }
      int temp = array[i];
      array[i] = min;
      array[minInd] = temp;

    }
    System.out.println(Arrays.toString(array));

  }
}
