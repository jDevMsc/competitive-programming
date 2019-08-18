package ru.ds;

/**
 * Addition and multiplication od complex numbers
 * a + b = (a.x + b.x) + (a.y + b.y)i
 * a * b = (a.x * b.x - a.y * b.y) + (a.x * b.y + a.y * b.x)i
 */
public class ComplNum {

  public static void main(String[] args) {
    Complex a = new Complex(-1.24f, 0.5f);
    Complex b = new Complex(2.1f, -0.1f);

    //сложение комплексных чисел
    float sumx = a.x + b.x;
    float sumy = a.y + b.y;

    System.out.printf("Сумма комплексного числа : %.2f + %.2fi\n", sumx, sumy);

    //умножение комплексных чисел
    float multx = a.x * b.x - a.y * b.y;
    float multy = a.x * b.y + a.y*b.x;
    System.out.printf("Произведение комплексного числа : %.2f + %.2fi", multx, multy);
  }
   static class Complex {
     float  x ;
     float y ;
     public Complex(float x, float y) {
       this.x = x;
       this.y = y;
     }
   }
}
