package ru.compprog.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a function that determines  the number  of digits
 *  of the entered integer
 */
public class DigOfNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(reader.readLine());
    System.out.println(func(number));
  }
  static int func(int num) {
    int dig = 0;
    while(num!=0) {
      num /= 10;
      dig++;
    }
    return dig;
  }
}
