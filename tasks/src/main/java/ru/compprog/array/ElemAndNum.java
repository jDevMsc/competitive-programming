package ru.compprog.array;

import java.util.Random;

public class ElemAndNum {

  public static void main(String[] args) {
    int[] array = new int[10];
    Random random = new Random();
    int max = array[0];
    int ind = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(20);
      if (array[i] > max) {
        max = array[i];
        ind = i; //также можно просто использовать индекс if(array[i]> array[ind])
      }
    }
    System.out.println("Максимальный элемент =" + max);
    System.out.println("Его индекс =" + ind);

  }

}
