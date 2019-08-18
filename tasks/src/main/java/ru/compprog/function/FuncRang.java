package ru.compprog.function;

/**
 * Calculate function y=f(x) over a given range
 */
public class FuncRang {


  public static void main(String[] args) {
    int x = 1;

    for (int i = -10; i <=10 ; i++) {
      System.out.print(func(i) + " ");
    }
  }

  static double func(int x) {
    double y = 0;

    if(x >= -5 && x <= 5) {
      y = Math.pow(x,2f);
    } else if(x  < -5) {
      y = 2*Math.abs(x) - 1;
    } else if(x>5) {
      y = 2*x;
    }
    return y;
  }

}
