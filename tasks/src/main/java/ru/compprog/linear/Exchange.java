package ru.compprog.linear;

public class Exchange {

  public static void main(String[] args) {
    int a = 5;
    int b = 4;
    exchange(a, b);
    exchangeVar2(a, b);
  }


  public static void exchange(int a, int b) {
    System.out.println("a = " + a + ", b = " + b);
    int c = a;
    a = b;
    b = c;
    System.out.println("a = " + a + ", b = " + b + "\n");
  }

  public static void exchangeVar2(int a, int b) {
    System.out.println("a = " + a + ", b = " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a = " + a + ", b = " + b);
  }


}
