package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumOfDiv {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите min , а потом max промежуток");

    int min = Integer.parseInt(reader.readLine());
    int max = Integer.parseInt(reader.readLine());
    System.out.println("Введите кол-вот делителей");

    int numDiv = Integer.parseInt(reader.readLine());

    while (min <= max) {
      int countDiv = 0;
      for (int i = 1; i < min; i++) {
        if (min % i == 0) {
          countDiv++;
        }
        if (countDiv >= numDiv) {
          System.out.println("Число - " + min + " имеет количество - " + countDiv);
          for (int j = 1; j < min; j++) {
            if (min % j == 0) {
              System.out.println("Делитель " + j);
            }
            min++;
          }
        }
      }

    }
  }

}
