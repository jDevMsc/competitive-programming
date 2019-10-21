package ru.compprog.search;

/**
 *  Время работы зависит от размера массива О(n)
 *  Низкая эффективность.
 */
public class Linear {

  public static void main(String[] args) {
    int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
    System.out.println(searchLinear(array,55));
  }
  public static int searchLinear(int[] array, int elementToFind) {
    for (int i = 0; i < array.length; i++) {
      if(array[i] == elementToFind) {
        return i;
      }
    }
    return -1;
  }
}
