package ru.compprog.sort;

import java.util.Arrays;

public class InsertSort {

  public static void main(String[] args) {
    int[] array = new int[]{7, 5, 3, 8, 1, 5};

    for (int i = 1; i < array.length; i++) {
      int currEl = array[i];
      int prevEl = i - 1;
      while (prevEl >= 0 && array[prevEl]> currEl) {
        array[prevEl+1] = array[prevEl];
        array[prevEl] = currEl;
        prevEl--;
      }
    }
    System.out.println(Arrays.toString(array));
  }

}
