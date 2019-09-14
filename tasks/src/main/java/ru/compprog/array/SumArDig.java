package ru.compprog.array;

/**
 * Sum of array digits
 */
public class SumArDig {

  public static void main(String[] args) {
    int[] array = {3, 16, 12, 1};
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      int temp = array[i];
      while (temp > 0) {
        sum += temp % 10;
        temp = temp / 10;
      }
    }
    System.out.println(sum);
  }
}
