package ru.compprog.cycle;

/**
 * ASCII character table display
 * After every 10ts character, go to a new string
 */
public class ASCIIDisplay {

  public static void main(String[] args) {
    for (int i = 32; i < 128; i++) {
      System.out.print((char) i + " ");
      if ((i - 1) % 10 == 0) {
        System.out.println();
      }
    }
  }
}
