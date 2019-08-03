package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TabFunc {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double min = Double.parseDouble(reader.readLine());
    double max = Double.parseDouble(reader.readLine());
    double step  = Double.parseDouble(reader.readLine());
    double  y;

    for (double i = min; i < max; i+=step) {
      y = -0.23 * Math.pow(i,2) + i;
      System.out.printf("%5.2f -> %5.2f\n", i,y);
    }
  }

}
