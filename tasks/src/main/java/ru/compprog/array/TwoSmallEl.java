package ru.compprog.array;

public class TwoSmallEl {

  public static void main(String[] args) {
    int[] array = {5, 10, 6, 2, 8, 2};
    int min1 = 0;
    int min2 = 1;

    //compare which of enitial elements is less
    if (array[min1] < array[min2]) {
      min2 = 1;
      min1 = 0;
    } else if (array[min1] > array[min2]) {
      min2 = 0;
      min1 = 1;
    }
//check next elements
    for (int i = 2; i < array.length; i++) {
      if(array[i] < array[min1]) {
        if(array[min1] < array[min2] ) {
          min2 = min1;
        }
          min1 = i;
      } else if(array[i] < array[min2]) {
        min2 = i;
      }
    }
    System.out.println("Наименьшие два элемента массива : " + array[min1] + " и " + array[min2]);
  }
}




