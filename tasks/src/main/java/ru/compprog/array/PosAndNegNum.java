package ru.compprog.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Expand random positive and negative numbers in different arrays
 */
public class PosAndNegNum {

  public static void main(String[] args) {
    Random random = new Random();
    int[] posArray = new int[10];
    int[] negArray = new int[10];
    int pos = 0;
    int neg = 0;
    int randNum;

    for (int i = 0; i < 10; i++) {
      randNum = -5 + random.nextInt(5 + 5 + 1);
      if (randNum > 0) {
        posArray[pos] = randNum;
        pos++;
      } else if (randNum < 0) {
        negArray[neg] = randNum;
        neg++;
      }
    }
    System.out.println(Arrays.toString(posArray));
    System.out.println(Arrays.toString(negArray));
  }
}
