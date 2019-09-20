package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * number of words into string
 */
public class NumWordInString {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   char[] exString = reader.readLine().toCharArray();
    int words = 0;
    boolean inWord = false;

    for(char s : exString) {
      if(s != ' ' && inWord == false) {
        words++;
        inWord = true;
      }else if(s == ' ') {
        inWord = false;
      }

    }
    System.out.println(words);

  }
}
