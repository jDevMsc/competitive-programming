package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(reader.readLine());
    int even = 0;
    int odd = 0;
    System.out.println("В числе " + number);
    while(number>0) {
      if(number%2==0) {
        even++;
      }else {
        odd++;
      }
      number /=10;
    }
    System.out.println( "Количество нечетных чисел = " + odd + "\nКоличетсво четных - " + even);
  }

}
