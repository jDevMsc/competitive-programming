package ru.compprog.function;

import java.util.Arrays;

/**
 * Sort an array in ascending order of digits
 */
public class SornSumNum {

  public static void main(String[] args) {
    int[] array = {14,30,13};

    int sum = 0;
    int one = 0;
    int two = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 1; j < array.length - i; j++) {
        if (sumOfDigits(array[j]) < sumOfDigits(array[j - 1])) {
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }

  static int sumOfDigits(int num) {
    int result = 0;
    result = num / 10;
    return result + (num % 10);
  }
}
