package ru.compprog.array;

public class MinElemModVer2 {

  public static void main(String[] args) {
    int[] array = new int[]{3, 7, -2, 4, -9, 1, 7, 8, 1};
    int minVal = array[0];

    for (int i = 0; i < array.length; i++) {
      if(Math.abs(minVal)>Math.abs(array[i])) {
        minVal = array[i];
      }
    }
    System.out.println("Минимальное значение по модулю - " + minVal);
    System.out.print("Номера элементов - ");

    for (int i = 0; i < array.length; i++) {
      if(array[i] == minVal) {
        System.out.print(i + " ");
      }
    }
  }
}
