package ru.compprog.array;

/**
 * Print non-repeating array elements
 */
public class NonRepeatEl {

  public static void main(String[] args) {
    int[] array = new int[]{1,2,3,3,2,4};

    for (int i = 0; i < array.length; i++) {
      int flag = 1;
      for (int j = 0; j < array.length; j++) {
        if(array[i] == array[j] && i != j) {
          flag = 0;
          break;
        }
      }
      if(flag == 1) {
        System.out.println(array[i]);
      }
    }
  }
}
