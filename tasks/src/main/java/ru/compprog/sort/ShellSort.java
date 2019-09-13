package ru.compprog.sort;

import java.util.Arrays;

/**
 * Works only with numbers
 */
public class ShellSort {

  public static void main(String[] args) {
    int[] mas = {10, 2, 10, 3, 1, 2, 5 , 4};

    int d = mas.length / 2;

    while(d > 0) {
      for (int i = 0; i < (mas.length - d); i++) {
        int j = i;
        while((j >= 0) && mas[j] > mas[j + d]) {
            int temp = mas[j];
          mas[j] = mas[j+d];
          mas[j+d] = temp;
          j--;
        }
      }
      d = d / 2;
    }


    System.out.println(Arrays.toString(mas));
  }

  }

