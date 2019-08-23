package ru.compprog.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Write a program that generate a number within specified boudaries
 */
public class RandomNumChar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    System.out.println("Введите целочисленные значения");
    int aInt = Integer.parseInt(reader.readLine());
    int bInt = Integer.parseInt(reader.readLine());
    int finNum = aInt + random.nextInt(bInt - aInt + 1);

    System.out.println("Введите вещественные значения");
    float aFloat = Float.parseFloat(reader.readLine());
    float bFloat = Float.parseFloat(reader.readLine());
    float finFloat = (float)(Math.random() * (bFloat-aFloat+1)) + aFloat;

    System.out.println("Введите символьные значения");
    char aChar = reader.readLine().charAt(0);
    char bChar = reader.readLine().charAt(0);
    char finChar = (char) (random.nextInt(bChar - aChar + 1) + aChar);


  }
}
