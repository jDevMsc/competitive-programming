package ru.compprog.sort;

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = new int[]{4, 5, 7, 9, 1};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {//каждая итерация уменьшает охват на 1
        if (array[j] > array[j + 1]) { //гоним больший элемент в конец массива
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

  }

}
