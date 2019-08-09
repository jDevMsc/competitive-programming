package ru.compprog.array;

import java.util.Random;

public class NumPosNegNullArray {

  public static void main(String[] args) {
    int[] array = new int[20];
    int pos =0;
    int neg = 0;
    int nul = 0;
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
    int rand = -5 + random.nextInt(4+5 +1);
      System.out.print(rand + " ");
      if(rand >0) {
        pos++;
      } else if(rand ==0) {
        nul++;
      }else neg++;
    }
    System.out.println("\nПоложительных чисел = " + pos);
    System.out.println("Отрицательных чисел = " + neg);
    System.out.println("Нулевых чисел = " + nul);

  }

}
