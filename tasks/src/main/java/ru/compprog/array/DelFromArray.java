package ru.compprog.array;

import java.util.Arrays;

public class DelFromArray {

  public static void main(String[] args) {
    int[] array = {1 , 4, 6, 7, 9 , 1};
    int delNum = 1;
    System.out.println("Массиы до удаления" + Arrays.toString(array));

    System.out.println("Массиы после удаления" + Arrays.toString(removeElement(array,delNum)));



  }

  public static int[] removeElement(int[] arr, int num) {
    int offset = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == num) {
        offset++;
      } else {
        arr[i-offset] = arr[i];
      }
    }
    //Coping from nums array in new array
    return Arrays.copyOf(arr,arr.length - offset);
  }
}
