package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Remove duplicate characters from a string
 */
public class DelRepeatCh {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    StringBuilder builder = new StringBuilder();
    Set<Character> characters = new HashSet<>();

    for(char c : input.toCharArray()) {
      if(!characters.contains(c) &&  c != ' ') {
        characters.add(c);
        builder.append(c);
      }
    }
    System.out.println(builder.toString());
  }
}
