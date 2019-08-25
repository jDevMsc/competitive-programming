package ru.compprog.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Determining whether a point belongs to a circle centered
 */
public class PointBelongCircle {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите координаты точки x,y");
    float x = Float.parseFloat(reader.readLine());
    float y = Float.parseFloat(reader.readLine());

    System.out.println("Введите радиус круга");
    float r = Float.parseFloat(reader.readLine());

    //ищем гипотенузу
    float h = (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("Гипотенуза равна = " + h);

    if (h > r) {
      System.out.println("Точка не пренадлежит кругу");
    } else {
      System.out.println("Точка принадлежит кругу");
    }
  }

}
