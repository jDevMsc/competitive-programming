package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The longest string in an array
 */
public class LongStrInArr {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] array = new String[4];
    String lengthStr = "";
    int indStr = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = reader.readLine();
      if(array[i].length() > lengthStr.length()) {
        lengthStr = array[i];
        indStr = i;
      }
    }

    System.out.println("Самая длинна ястрока в массиве = \"" + array[indStr] + "\" индекс: " + indStr);


    }
}
