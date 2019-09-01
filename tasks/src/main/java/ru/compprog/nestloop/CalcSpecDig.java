package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculate the total of specific digits in numbers
 */
public class CalcSpecDig {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int numSeq;
    System.out.println("Сколько раз будет подсчет");
    int num = Integer.parseInt(reader.readLine());
    System.out.println("Какую цифру будем искать?");
    int secNum = Integer.parseInt(reader.readLine());

    int count = 0;

    for (int i = 0; i < num; i++) {
      System.out.println("Введите число для подсчета");
      numSeq = Integer.parseInt(reader.readLine());
      while (numSeq > 0) {
        int lastNum = numSeq % 10;
        if (lastNum == secNum) {
          count++;
          numSeq = numSeq / 10;
        } else {
          numSeq = numSeq / 10;

        }
      }
    }

    System.out.println("Количество цифр в числах = " + count);
  }
}
