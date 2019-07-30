package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordOrNum {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a;
    try {
      a = Integer.parseInt(reader.readLine());
      if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
        System.out.println("Это буква " + (char)a);
      } else {
        System.out.println("Это не буква,а символ " + (char)a);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
