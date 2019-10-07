package ru.compprog.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Remove extra spaces
 */
public class RemoveSpaces {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    StringBuilder builder = new StringBuilder();

    if(file.exists()) {
      Scanner scanner = new Scanner(file);
        String inputRow = scanner.nextLine().trim().replaceAll("\\s{2,}", " ");
      System.out.println(inputRow);
      }
    }
  }
