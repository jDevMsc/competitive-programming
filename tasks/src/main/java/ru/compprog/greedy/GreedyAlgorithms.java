package ru.compprog.greedy;

import java.util.Arrays;

/**
 * the largest number from an array of numbers
 */
public class GreedyAlgorithms {

  public static void main(String[] args) {
    int[] digits = {3, 1, 7, 9, 9, 5 };
    System.out.println(maxNumberFromDigits(digits));
  }

  public static String maxNumberFromDigits(int[] digits) {
    StringBuilder builder = new StringBuilder();
    //O(n * log(n))  sort
    Arrays.sort(digits);
    //O(n) concat
    for (int i = digits.length-1; i >= 0 ; i--) {
      builder.append(digits[i]);
    }
    //Java 8 String.join("", Arrays.stream(digits).boxed().sorted(Collections.reverseOrder())
    // .map(String::valueOf).toArray(String[]::new));

    return builder.toString();
  }
}
