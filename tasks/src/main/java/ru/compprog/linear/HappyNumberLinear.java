package ru.compprog.linear;

/**
 * Using a linear algorithm (without for) to find all the lucky
 * numbers in the interval version 1
 */
public class HappyNumberLinear {

  public static void main(String[] args) {
    int start = 100000;
    int end = 999999;
    int amount = 0;
    while (start < end) {
      int first = start/100000;
      int second = start/10000%10;
      int third = start/1000%10;
      int fourth = start/100%10;
      int fifth = start/10%10;
      int sixth = start%10;
      if((first + second + third) == (fourth + fifth + sixth)) {
        amount++;
      }
      start++;
    }
    System.out.println("Колдичество счастливых чисел  = " + amount);
  }
}
