package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * From two random numbers, one of which is even and the other is odd, deremine and display an odd
 * number
 */
public class EvAndOddNum {

  public static void main(String[] args) throws IOException {
    Random random = new Random();
    int first = random.nextInt();
    int second = random.nextInt();
    if (first % 2 != 0 && second % 2 != 0 || first % 2 == 0 && second % 2 == 0) {
      first += 1;
    }
    if( first % 2 != 0) {
      System.out.println("Число " + first + " является не четным");
    } else {
      System.out.println("Число " + second + " является не четным");

    }
  }
}
