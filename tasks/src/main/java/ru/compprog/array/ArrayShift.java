package ru.compprog.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Shift array elements in the indicated
 * direction and by the specified numbers of steps
 */
public class ArrayShift {

  public static void main(String[] args) throws IOException {
    Random random = new Random();
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = 1 +random.nextInt(10);
    }
    System.out.println(Arrays.toString(array));

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите направление сдвига[ +: влево. -: вправо]");
    String direct = reader.readLine();
    System.out.println("Введите количество шаго в для сдвига");
    int quan = Integer.parseInt(reader.readLine());

    for (int i = 0; i < quan; i++) {
      if(direct.equals("+")) {
        for (int j = 0; j < array.length-1; j++) {
          array[j] = array[j+1];
        }
        array[array.length - 1 - i] = 0;
        System.out.println(Arrays.toString(array));
      } else if(direct.equals("-")) {
        for (int j = 0; j < array.length-1; j++) {
          array[array.length - 1 - j] = array[array.length - 2 - j];
        }
        array[i] = 0;
        System.out.println(Arrays.toString(array));
      }

    }

  }
}
