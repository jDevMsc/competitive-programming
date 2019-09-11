package ru.compprog.array;

/**
 * Te number most commonly found in array
 */
public class FrequenNum {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 1, 1, 2, 3, 3, 1};
    int max_freq = 1;
    int num = 0;

    for (int i = 0; i < array.length - 1; i++) {
      int freq = 1;

      for (int j = 1; j < array.length ; j++) {
        if (array[i] == array[j]) {
          freq++;
        }
        if(freq > max_freq) {
          max_freq = freq;
          num = array[i];
        }
      }
    }
    System.out.println("Максимально врстечающийся эедлемент в массиве = " + num);
  }
}
