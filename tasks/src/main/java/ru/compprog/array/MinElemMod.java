package ru.compprog.array;

public class MinElemMod {

  public static void main(String[] args) {
    int[] array = new int[]{10, -3, -5, 2, 5};
    int indMin = 0;

    for (int i = 0; i < array.length; i++) {

      if(Math.abs(array[i])<Math.abs(array[indMin])) {
        indMin = i;
      }
    }
    System.out.println("Минимальное значение по модулю - " + array[indMin] + " - индекс: " + indMin);
  }

}
