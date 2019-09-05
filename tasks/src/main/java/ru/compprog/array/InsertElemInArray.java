package ru.compprog.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Random insert an element in the array
 */
public class InsertElemInArray {

  public static void main(String[] args) throws IOException {
    int[] numArray = new int[]{1, 2, 3, 4, 0};

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Число");
    int specNum = Integer.parseInt(reader.readLine());
    System.out.println("Позиция");
    int position = Integer.parseInt(reader.readLine());

    System.out.println("Массив до изменения = " + Arrays.toString(numArray));
    for (int i = 0; i < numArray.length - position - 1; i++) {
      numArray[numArray.length - 1 - i] = numArray[numArray.length - 2 - i];
    }

    numArray[position] = specNum;
    System.out.println("Массив после изменения = " + Arrays.toString(numArray));


  }

}
