package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int min = Integer.parseInt(reader.readLine());
    int max = min%10;
    min = min/10;

    while(min>0) {
      if(min%10>max) {
        max = min%10;
      }
      min = min/10;
    }
    System.out.println(max);
  }

}
