package ru.compprog.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Find  squares of different shapes.
 */
public class SquaresShap {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Квадрат, круг или прямоугольник?");
    String shape = reader.readLine();
    switch(shape) {
      case "Квадрат" :
        System.out.println("Введите длину и ширину");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Площадь квадрата - " + squar(a,b));
        break;
      case "Треугольник" :
        System.out.println("Введите сторон треугольника");
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        System.out.println("Площадь треугольника - " + triangle(c, d, e));
        break;
      case "Круг" :
        System.out.println("Введите радиус круга");
        double f = Double.parseDouble(reader.readLine());
        System.out.println("Площадь круга - " + circle(f));
        break;
        default:
          break;
    }

  }
  static double squar(int a, int b) {
    return  a*b;
  }

  static double triangle(int a, int b, int c) { //если использовать формулу Герона
    int p = a+b+c/2;
    return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }

  static double circle(double r) {
    return  Math.PI*Math.pow(r,2);

  }

}
