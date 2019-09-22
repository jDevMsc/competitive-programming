package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Compose the words from the entered letters
 */
public class WordsFromChar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    int sLength = s.length();
    int wordCount = 4;
    int newWordLength;
    int countLetter;
    Random random = new Random();

    StringBuilder builder;

    for (int i = 0; i < wordCount; i++) {
      newWordLength = 2 + random.nextInt(7 - 2 + 1);
      builder = new StringBuilder();
      for (int j = 0; j < newWordLength; j++) {
        builder.append(s.charAt(random.nextInt(sLength)));
      }
      System.out.println(builder.toString());
    }

  }
}
