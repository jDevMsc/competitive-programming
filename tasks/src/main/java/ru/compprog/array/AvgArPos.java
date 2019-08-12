package ru.compprog.array;

import java.util.Random;

public class AvgArPos {

  public static void main(String[] args) {
    int[] array = new int[10];
    Random random = new Random();
    int sumPos = 0;
    int qty = 0;

    for (int i = 0; i < array.length; i++) {
        array[i] = -5 + random.nextInt(4 + 5 + 1);
      if(array[i] > 0) {
        sumPos += array[i];
        qty++;
      }
    }
    System.out.println("Среднее арифмитическое положительных чисел:" + (double)sumPos/qty);
  }

}
