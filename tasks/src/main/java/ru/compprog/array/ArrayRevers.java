package ru.compprog.array;

import java.util.Arrays;

/**
 * Rearrange the elements of an array in the reverse order
 */
public class ArrayRevers {

  public static void main(String[] args) {
    int[] arrayStart = new int[]{1,2,3,4,5,6,7};
    int[] result = new int[7];

    for (int i = 0; i < arrayStart.length; i++) {
      result[result.length-i-1] = arrayStart[i];
    }

    System.out.println(Arrays.toString(result));


    //vers2

  }
}
