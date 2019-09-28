package ru.compprog.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate  rows and all words in file
 */
public class CountRowWord {

  public static void main(String[] args) throws FileNotFoundException {
    int row = 0;
    int word = 0;
    File file = new File("C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    Scanner scanner = new Scanner(file);

    while(scanner.hasNextLine()) {
      row++;
      String[] array = scanner.nextLine().split(" ");
      word+= array.length;
    }

    System.out.println("rows: " + row + " words: " + word);
  }
}
