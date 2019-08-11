package ru.compprog.branch;

public class MaksThree {

  public static void main(String[] args) {
    System.out.println(maxv2(3, 4, 3));
  }

  public static int max(int a, int b, int c) {
    int result;
    if (a > b) {
      if (a > c) {
        result = a;
      } else {
        result = c;
      }
    }
    if (b > c) {
      result = b;
    } else {
      result = c;
    }
    return result;
  }

  public static int maxv2(int a, int b, int c) {
    int result = a > b ? a : b;
    return result > c ? result : c;
  }

}
