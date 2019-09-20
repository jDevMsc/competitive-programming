package ru.compprog.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Using the coordinates of two points entered by user, derive the equation of a string passing
 * through these points. y = kx + b
 */
public class EquationInCoord {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите координатуц точки А");
    float x1 = Float.parseFloat(reader.readLine());
    float y1 = Float.parseFloat(reader.readLine());
    System.out.println("Введите координатуц точки Б");
    float x2 = Float.parseFloat(reader.readLine());
    float y2 = Float.parseFloat(reader.readLine());

    float k = (y1 - y2) / (x1 - x2),
        b = y2 - k * x2;
    System.out.printf("A(x1;y1): " + x1 + " " + y1 + "\n");
    System.out.printf("A(x1;y1): " + x2 + " " + y2+ "\n");

    System.out.printf("Уравнение прямой: y = %.2fx + %.2f ", k, b);

  }

}
