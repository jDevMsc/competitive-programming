package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Is the string an identifier
 */
public class IsStringId {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char[] inputString = reader.readLine().toCharArray();
    boolean within = true;

    for (int i = 0; i < inputString.length; i++) {
      if(!(inputString[i] >= 'a' && inputString[i] <= 'z' ||
          inputString[i] >= 'A' && inputString[i] <= 'Z' ||
          inputString[i] == '_' || inputString[i] >= '0' ||
          inputString[i] <= '9' )) {
        System.out.println("No, the string is not an idetifier");
        within = false;
        break;
      }
    }
    if(within) {
      if (inputString[0] <= '9' && inputString[0] >= '0')
        System.out.println("No\n");
      else
        System.out.println("Yes\n");
    }
  }
}
