package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a program that will add, substruct, multiply
 * or divide two numbers
 */
public class EasyCalc {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int first;
    int second;
    String sign;
    while(true) {
      System.out.println("Введите первое число");
      first = Integer.parseInt(reader.readLine());
      System.out.println("Введите второе число");
      second = Integer.parseInt(reader.readLine());
      System.out.println("Введите знак");
      sign = reader.readLine();
      if(sign.equals("O")) {
        System.out.println("Завершение программы");
        break;
      }
      switch (sign) {
        case "+" :
          System.out.println("Операция сложения: " + (first + second));
          break;
        case "-" :
          System.out.println("Операция вычитания: " + (first - second));
          break;
        case "*" :
          System.out.println("Операция умножения: " + first * second);
          break;
        case "/" :
          System.out.println("Операция деления: " + first / second);
          break;
          default:
            System.out.println("Вы ввели не верный знак");
      }
    }
  }
}
