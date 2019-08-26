package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Define a quarter of the coordinate plane to which the point belongs
 */
public class PointCoordQuarter {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float x = Float.parseFloat(reader.readLine());
    float y = Float.parseFloat(reader.readLine());

    if (x > 0 && y > 0) {
      System.out.println("I четверть");
    } else if(x<0 && y>0) {
      System.out.println("II четверть");
    } else if (x<0 && y<0) {
      System.out.println("III четверть");
    } else if(x>0 && y<0) {
      System.out.println("IV четверть");
    }
  }
}
