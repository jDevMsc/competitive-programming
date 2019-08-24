package ru.compprog.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The number of characters between two letters of the alphabet.
 * Definition of a letter by its number in the alphabet
 */
public class DistanceTwoLet {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char a = reader.readLine().charAt(0);
    char b = reader.readLine().charAt(0);
    System.out.println("Позиция первой буквы =" + (int)a);
    System.out.println("Позиция первой буквы =" + (int)b);
    System.out.println("Расстояние между буквами =" + (a - b -1));
    int  c = Integer.parseInt(reader.readLine());
    System.out.println(c + " - это буква - " + (char)c);

  }

}
