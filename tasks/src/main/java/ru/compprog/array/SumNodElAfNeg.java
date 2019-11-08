package ru.compprog.array;

/**
 * The sumRecursive of the modules of the array
 * elements located after first negative
 */
public class SumNodElAfNeg {

  public static void main(String[] args) {
    int[] array = {5, 3, -1, 8, 0, -6, 1};
    int sum = 0;
    int negInd = -1;

    for (int i = 0; i < array.length; i++) {
      if(array[i] < 0) {
        negInd = i;
        break;
      }
    }
    if(negInd > array.length) {
      System.out.println("В массиве нет отрицательных елементов");
    } else {
      for (int i = negInd + 1; i < array.length; i++) {
        sum += Math.abs(array[i]);
      }
      System.out.println(sum);
    }
  }
}