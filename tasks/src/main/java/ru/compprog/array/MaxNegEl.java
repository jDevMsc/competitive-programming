package ru.compprog.array;

/**
 * The maximum negative array element
 */

public class MaxNegEl {

  public static void main(String[] args) {
    int[] array = {1, -7, 5, -1, 4, 5, -5, 1, -3};
    int maxNeg = 0;
    boolean neg = true;

    for (int value : array) {
      if (value < 0 && neg) {
        maxNeg = value;
        neg = false;
      }
      if (value < 0 && value > maxNeg) {
        maxNeg = value;
      }
    }

    System.out.println(maxNeg);

  }
}
