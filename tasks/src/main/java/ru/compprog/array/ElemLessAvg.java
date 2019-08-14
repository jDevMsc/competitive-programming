package ru.compprog.array;

/**
 *Find in array those element whose value is less
 * than the arithmetic average taken from all elements
 */
public class ElemLessAvg {

  public static void main(String[] args) {
    int[] array = new int[]{38 ,67 ,71 ,56 ,34 ,11 ,17 ,84 ,92, 61};
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    int avg = sum/array.length;

    for (int i = 0; i < array.length; i++) {
      if(array[i] < avg ) {
        System.out.println(array[i]);
      }
    }
  }
}
