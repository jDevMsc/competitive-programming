package ru.compprog.line;

/**
 * Numbers of lowercase and uppercase letters per string
 */
public class NumLet {

  public static void main(String[] args) {
    String test = "homeHOMEho";
    int low =0;
    int upp = 0;
    char[] test2 = test.toCharArray();

    for (int i = 0; i < test.length(); i++) {
      if(test.charAt(i) > 'a' && test.charAt(i) < 'z') {
        low++;
      } else if(test.charAt(i) > 'A' && test.charAt(i) < 'Z') {
        upp++;
      }
    }
    System.out.printf("Numbers of lowercase letters : %d\n",low);
    System.out.printf("Numbers of uppercase letters : %d",upp);

  }

}
