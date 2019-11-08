package ru.compprog.array;

/**
 * Find the sumRecursive of elements between the min and max array elements
 */
public class SumBetwMinMax {

  public static void main(String[] args) {
    int[] array = {39, 21, 12, 14, 24, 37, 33, 46, 38, 22};
    int min = 0;
    int max = 0;
    int sum = 0;
    int i = 0;

    for (i = 1; i < array.length; i++) {
      if (array[min] > array[i]) {
        min = i;
      }
      if (array[max] < array[i]) {
        max = i;
      }
    }
    if (max < min) {
      i = min;
      min = max;
      max = i;
    }

    for (i = min + 1; i < max; i++) {
      sum += array[i];

    }
    System.out.println("Сумма между элементами =" + sum);
  }
}
