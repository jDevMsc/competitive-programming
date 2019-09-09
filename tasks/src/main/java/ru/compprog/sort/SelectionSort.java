package ru.compprog.sort;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] test = {5, 1, 2, 4, 5, 6};

    for (int i = 0; i < test.length; i++) {
      int min = test[i];
      int minId = i;
      for (int j =  i; j < test.length; j++) {
        if(test[j] < min) {
          min = test[j];
          minId = j;
        }
      }
      int temp = test[i];
      test[i] = min;
      test[minId] = temp;
    }

    System.out.println(Arrays.toString(test));
  }
}
