package ru.compprog.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Find the maximum modulo element in an array with unique modulo values
 */
public class MaxModElemAmongUnique {

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[10];
    array[0] = -5 + random.nextInt(15 + 5 + 1);
    int temp;
    boolean notContains;

    int i = 1;
    while(i<10) {
      temp = -5 + random.nextInt(15 + 5 + 1);
      notContains = true;
      for (int j = 0  ; j < i; j++) {
        if (Math.abs(array[j]) == Math.abs(temp)) {
          notContains = false;
          break;
        }

      }
      if (notContains) {
        array[i] = temp;
        i++;
      }
    }
    System.out.println(Arrays.toString(array));

    int maxAbs = 0;
    for (int j = 0; j < array.length; j++) {
      if(Math.abs(array[j]) > Math.abs(array[maxAbs])) {
        maxAbs = j;
      }
    }
    System.out.println("Максимальный эелемент среди уникальных по модуля = " + array[maxAbs]);
  }
}
