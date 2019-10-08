package ru.compprog.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * find the longest word in the string
 */
public class LongestWordInString {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File(
        "C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    Scanner scanner = new Scanner(file);
    int count = 0;
    int longest = 0;
    int ind = 0;
    int i;
    String input;

    while (scanner.hasNextLine()) {
      input = scanner.nextLine().trim();
      for (i = 0; i < input.length(); i++) {
        if (input.charAt(i) != ' ') {
          count++;
        } else if (input.charAt(i) == ' ') {
          if (count > longest) {
            longest = count;
            ind = i - count;
          }
          count = 0;

        }
      }
      if (count > longest) {
        longest = count;
        ind = i - count;
      }

      StringBuilder builder = new StringBuilder();
      for (int j = ind; j < ind + longest; j++) {
        builder.append(input.charAt(j));
      }

//      String longestStr = input.substring(ind, longest);
      System.out.println("Самое длинное слово: " + builder.toString());
    }
  }
}
