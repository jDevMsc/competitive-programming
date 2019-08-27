package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Among the three numbers find the average
 */
public class AverThreeNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int firstNum = Integer.parseInt(reader.readLine());
    int secondNum = Integer.parseInt(reader.readLine());
    int thirdNum = Integer.parseInt(reader.readLine());

    if(firstNum > secondNum && firstNum < thirdNum || firstNum > thirdNum && firstNum < secondNum) {
      System.out.println("Число " + firstNum + "является большим среди всех чисел");
    } else if(secondNum > firstNum && secondNum < thirdNum || secondNum < firstNum && secondNum > thirdNum) {
      System.out.println("Число " + secondNum + "является большим среди всех чисел");
    } else {
      System.out.println("Число " + thirdNum + "является большим среди всех чисел");

    }

  }
}
