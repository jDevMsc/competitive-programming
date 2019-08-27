package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Determine whether the year that the user entered ia a leap year or not/
 */
public class LeapYear {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int year = Integer.parseInt(reader.readLine());

    if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
      System.out.println("Год " + year + " не високосный");
    } else {
      System.out.println("Год " + year + " не високосный");
    }
  }
}
