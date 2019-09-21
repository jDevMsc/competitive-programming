package ru.compprog.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Substring replacement
 * Find the substring in the string and replace it with new one
 */
public class ReplSubstr {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String main = reader.readLine();
    String substr = reader.readLine();
    String substrNew = reader.readLine();

    System.out.println(main.replace(substr,substrNew));

  }
}
