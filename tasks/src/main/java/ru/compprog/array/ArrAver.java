package ru.compprog.array;

/**
 * Finding the minimum, maximum and average values of array.
 * author: Artem Luzan
 **/
public class ArrAver {

  public static void main(String[] args) {
    double[] array = new double[20];
    double min = array[0];
    double max = array[0];
    double avg = array[0];

    for (int i = 0; i < array.length; i++) {
      array[0] = Math.random();
      if (min > array[i])
        min = array[i];
      if (max < array[i])
        max = array[i];
      avg += array[i] / array.length;
    }

    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("avg = " + avg);


  }

}
