package ru.compprog.function;

/**
 * Reverse the order of words in a string
 */
public class RevererseWordInStr {

  public static void main(String[] args) {
    String test = "1abcdefg 2abcdefg 3abcdefg";
    System.out.println(reverseStr(test));
  }

  static String reverseStr(String s) {
    StringBuilder builder = new StringBuilder();
    String[] array = s.trim().split("");
    for (int i = array.length-1; i > 0 ; i--) {
      builder.append(array[i]);
    }
    return builder.toString();
  }
}
