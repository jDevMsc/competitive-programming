package ru.compprog.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Decimal to binary conversion function
 */
public class DecToBin {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      String input = reader.readLine();
      if(input.equals("X")) {
        break;
      }

      System.out.println(decToBin(input).toString());
    }
  }

  public static StringBuilder decToBin(String input) {
    int decimal = Integer.parseInt(input);
    StringBuilder builder = new StringBuilder();

    while(decimal!= 1) {
      builder.append(decimal % 2);
      decimal/=2;
    }
    builder.append(1);
    return builder.reverse();
    }
}
