package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Remove spaces from the string and determine if it is a palindrome
 */
public class DelSpIsPolindrom {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String stringTest = reader.readLine();
    StringBuilder result = new StringBuilder();

    for(char c : stringTest.toCharArray()) {
      if(c == ' ') {
        continue;
      } else {
        result.append(c);
      }
    }

    if(result.toString().equals(reverse(result.toString()))) {
      System.out.println("Yes it string is polindrom");
    } else {
      System.out.println("NO itn't string is polindrom");

    }


  }

  public static String reverse(String s) {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < s.length(); i ++) {
      builder.append(s.toCharArray()[s.length()-i-1]);
    }
    return  builder.toString();
  }
}
