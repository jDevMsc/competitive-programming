package ru.compprog.array;

/**
 * find second element in array
 */
public class SecMinElement {

  public static void main(String[] args) {
    int[] array = {64, 42, 73, 41, 32, 53, 169, 24, 57, 42, 74, 55, 36};

    int min = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        second = min;
        min = array[i];
      } else if (array[i] < second && array[i] != min) {
        second = array[i];
      }

    }

    if(second != Integer.MAX_VALUE) {
      System.out.println("Second min element in array : " + second);
    } else {
      System.out.println("The second element is missing " );
    }
    System.out.println(" First min element in array : " + min);


  }
}
