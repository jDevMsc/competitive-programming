package ru.compprog.array;

import java.util.Random;

/**
 *
 */
public class ArrNumMod {

  public static void main(String[] args) {
    int[] array = new int[20];
    Random random = new Random();
    int max = array[0];
    int num = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = -15 + random.nextInt(14 + 15 + 1);
      if(max<array[i]) {
        max = array[i];
      }
    }
    for (int i = 0; i < array.length; i++) {
      if(Math.abs(array[i]) > max) {
        num++;
      }
    }
    System.out.println("Количество элементов по модулю больше чем " + max + " = " + num);
  }
}
