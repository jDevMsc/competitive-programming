package ru.compprog.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The sumRecursive and multiply of a digits of a three-digit  number
 */
public class SumMultDigNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    int a = num/100;
    int b  = num/10%10;
    int c = num%10;

    System.out.println("Sum: " + (a+b+c));
    System.out.println("Mult: " + a*b*c);

    /*цикл
    int sumRecursive = 0;
    int mult = 1;
    while(num>0) {
      sumRecursive += num%10;
      mult *= num%10;
      num = num/10;
    }*/
    //System.out.println("Sum : " + sumRecursive + "\nMult : " + mult);
  }
}
