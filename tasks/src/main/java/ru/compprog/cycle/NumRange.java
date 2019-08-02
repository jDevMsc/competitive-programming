package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumRange {

  public static void main(String[] args) {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int min;
    int max;
    int step;
    try {
      min = Integer.parseInt(reader.readLine());
      max = Integer.parseInt(reader.readLine());
      step = Integer.parseInt(reader.readLine());

      for (int i = min; i <= max; i += step) {
        System.out.print(i + " ");

      }


    } catch (IOException e) {
      e.printStackTrace();
    }
  }




}
