package ru.compprog.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Rectangle of characters
 */
public class RectOfChar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите высоту прямоугольника");
    int height = Integer.parseInt(reader.readLine());
    System.out.println("Введите ширину прямоугольника");
    int width = Integer.parseInt(reader.readLine());
    System.out.println("Введите детали заполнения");
    String side = reader.readLine();
    String body = reader.readLine();

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if(i == 0 || i == height-1) {
          System.out.printf("%3s",side);
        } else if(j == 0 || j == width - 1){
          System.out.printf("%3s",side);
        } else {
          System.out.printf("%3s",body);
        }
      }
      System.out.println();
    }
  }
}
