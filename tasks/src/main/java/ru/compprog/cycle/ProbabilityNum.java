package ru.compprog.cycle;

import java.util.Random;

public class ProbabilityNum {

  public static void main(String[] args) {
    Random random = new Random();
    double count = 0;

    for (int i = 0; i < 1000; i++) {
      int a = random.nextInt(1000);
      if(a%2!=0) {
        count++;
      }
    }
    System.out.println(count/1000*100);
  }
}
