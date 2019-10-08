package ru.compprog.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Filter numbers from string
 */
public class FilterNums {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File(
        "C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    Scanner scanner = new Scanner(file);
    String[] array;
    String numbers = "";

    String input = scanner.nextLine().trim();

    for (int i = 0; i < input.length(); i++) {
      if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
        numbers += input.charAt(i);
      } else if (input.charAt(i) == ' '){
        numbers += input.charAt(i);
      }
    }
    array = numbers.trim().replaceAll("\\s{2,}", " ").split(" ");
    System.out.println(Arrays.toString(array));
  }
}
