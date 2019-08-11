package ru.compprog.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class FillArr {

  public static void main(String[] args) {
    int[] first = new int[5];
    int[] second = new int[5];
    int[] third = new int[5];
    Random random = new Random();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < first.length; i++) {
      first[i] = random.nextInt(10);
    }
    for (int i = 0; i < second.length; i++) {
      try {
        second[i] = Integer.parseInt(reader.readLine());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    for (int i = 0; i < third.length; i++) {
      third[i] = first[i] + second[i];
    }
  }

}
