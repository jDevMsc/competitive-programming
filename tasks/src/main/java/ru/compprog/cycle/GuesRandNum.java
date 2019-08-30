package ru.compprog.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * The user must guess a random number in no more than 10 attempts.
 */
public class GuesRandNum {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    int gues = random.nextInt(100);
    boolean result = true;
    int attempt = 0;

    while (result && attempt < 10) {
      System.out.printf("Отгадайте случайное число, у вас есть %d попыток\n", 10 - attempt);
      System.out.println("Введите чило");
      int userNum = Integer.parseInt(reader.readLine());

      if (userNum == gues) {
        System.out.println("Урра! Вы отгадали число");
        result = false;
      } else if (userNum > gues) {
        System.out.println("Случайное число меньше, попробуйте еще раз");
        attempt++;
      } else if (userNum < gues) {
        System.out.println("Случайное число больше, попробуйте еще раз");
        attempt++;
      }
    }
    if (attempt == 10) {
      System.out.println("Вы проиграли и ваши попытки закончились");
    }

  }

}
