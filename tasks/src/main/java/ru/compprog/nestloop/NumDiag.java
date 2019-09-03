package ru.compprog.nestloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Print sthe symbol along the diagonals of a square
 */
public class NumDiag {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Высота");
    int height = Integer.parseInt(reader.readLine());
    System.out.println("Ширина");
    int width = Integer.parseInt(reader.readLine());
    System.out.println("Цифра заполнения");
    int num = Integer.parseInt(reader.readLine());
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if( i == j || j == width-1-i) {
          System.out.printf("%3d",num);
        } else {
          System.out.print(" 0 ");
        }
      }
      System.out.println();
    }
  }
}
