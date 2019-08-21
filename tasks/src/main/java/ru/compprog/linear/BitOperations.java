package ru.compprog.linear;

/**
 * Bit operations on numbers
 */
public class BitOperations {

  public static void main(String[] args) {
    int a = 5;
    int b = 6;

    System.out.println(a & b);
    /** И
     * 101
     * 110
     * 100 - это десятичное число 4
     */
    System.out.println(a | b);
    /** Или
     * 101
     * 110
     * 111 - это число 7
     */
    System.out.println(a ^ b);
    /** искл Или
     * 101
     * 110
     * 011 - это число 3.
     */
    System.out.println(a >> 2);
    /**
     * 101>>2 = 001(1)
     */
    System.out.println(b >> 2);
    /**
     * 110>>2 = 001(1)
     */
    System.out.println(a << 2);
    /**
     * 101<<2 = 11101(20)
     */
    System.out.println(b << 2);
    /**
     * 110<<2 = 11110(24)
     */

  }
}
