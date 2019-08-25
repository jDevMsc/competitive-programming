package ru.compprog.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Derermine existence of a triangle If it exists, then determine whether it is varsatile, isosceles
 * or equilateral.
 */
public class DetermExistTrian {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if (a + b > c || a + c > b || c + b > a) {
      System.out.println("Triangle is exists!");
      if (a != b && a != c && c != b) {
        System.out.println("Triangle is versatile");
      } else if( a == b && b == c) {
        System.out.println("Triangle is equilateral.");
      }else {
        System.out.println("Triangle is isosceles.");
      }} else {
      System.out.println("Triangle is not exists!");
    }

  }

}
