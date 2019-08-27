package ru.compprog.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Find the roots of the quadratic equation and display if exist.
 * ax2 + bx + c = 0
 */
public class QuadEquation {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float a =  Float.parseFloat(reader.readLine());
    float b = Float.parseFloat(reader.readLine());
    float c = Float.parseFloat(reader.readLine());
    float decs = b*b - 4*a*c;
    if(decs > 0) {
      float x1 = (float)((-b + Math.sqrt(decs))/(2*a)) ;
      float x2 = (float)((-b - Math.sqrt(decs))/(2*a)) ;
      System.out.println("Корни урвнения = " + x1 + " и " + x2 );
    } else if(decs == 0) {
      float x1 = (float)(-b /2*a) ;
      System.out.println("Корень уравнения = " + x1 );
    } else {
      System.out.println("Уравнение не содержит корней" );
    }
  }
}
