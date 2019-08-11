package ru.compprog.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SunAndMultArray {

  public static void main(String[] args) {
    int[] array = new int[5];
    int sum = 0;
    int mult = 1;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < array.length; i++) {
      try {
        array[i] = Integer.parseInt(reader.readLine());
        sum += array[i];
        mult *= array[i];
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d \n", array[i]);
    }
    System.out.printf("Сумма элементов массива  - %d\n", sum);
    System.out.printf("Произведение элементов массива  - %d\n", mult);

  }

}
