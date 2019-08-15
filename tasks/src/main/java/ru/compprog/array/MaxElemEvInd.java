package ru.compprog.array;

/**
 * in the array find the maximum element with  an even index
 */
public class MaxElemEvInd {

  public static void main(String[] args) {
    int[] array = new int[]{37, 81 ,23, 91 ,66 ,36 ,59,  6, 25 ,57};
    int max = array[0];

    for (int i = 0; i < array.length; i=i+2) {
      if(array[i] > max) {
        max = array[i];
      }
    }
    System.out.println(max);
  }
}
