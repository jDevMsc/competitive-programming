package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BtKb {

  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int a;
    String spec;
    try {
      System.out.println("Введите число");
      a = Integer.parseInt(bufferedReader.readLine());
      System.out.println("Введите букву перевода: b или k");
      spec = bufferedReader.readLine(); //b or k
      if (spec.equals("b")) {
        System.out.println(a * 1024);
      } else if (spec.equals("k")) {
        System.out.println((double) a / 1024);
      } else {
        System.out.println("Неверный ввод");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }


  }


}
