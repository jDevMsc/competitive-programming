package ru.compprog.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Fins lines containing specific values ia a file
 */
public class FindRowWithSpecValues {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\projects\\compProg\\compProg\\tasks\\src\\main\\java\\ru\\compprog\\files\\test.txt");
    Scanner scanner = new Scanner(file);

    int avgScore = 0;
    int allScore = 0;
    int amointPeoples = 0;

    while(scanner.hasNextLine()) {
      amointPeoples++;
      String input = scanner.nextLine();
      int score = Character.getNumericValue(input.charAt(input.length()-1));
      if(score < 3) {
        System.out.println(input);
      }
      allScore += score;
    }
    avgScore = allScore / amointPeoples;
    System.out.println("\nСредняя оценка : " + avgScore);

  }
}
