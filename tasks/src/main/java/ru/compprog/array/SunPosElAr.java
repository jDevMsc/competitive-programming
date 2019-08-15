package ru.compprog.array;

/**
 * In an array counting positive and negative integers,
 * calculate the sum of even positive elements
 */
public class SunPosElAr {

  public static void main(String[] args) {
    int[] array = new int[]{-1  , 4 , -5  , 4 , -5 , -1  , 0  , 1 , -2 , -5};
    int sum = 0;

    for (int i = 0; i < array.length; i=i+2) {
      if(array[i] > 0) {
        sum += array[i];
      }
    }
    System.out.println("Сумма положительных элементов массива = " + sum);
  }

}
