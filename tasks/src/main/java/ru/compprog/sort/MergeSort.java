package ru.compprog.sort;

import java.util.Arrays;

/**
 * Принцип разделяй и властвуй. Разбивается на массивы по одному элементу(contrast quick) по этапнео
 * разделяются в сортировочном поррядке Медленнее бустрой, но стабильна в проиводительности() в
 * зависимости от quick
 */
public class MergeSort {

  public static void main(String[] args) {
    int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
    System.out.println(Arrays.toString(array));
    array = mergeSort(array);
  }

  public static int[] mergeSort(int[] array) {
    int[] tmp;
    int[] currentSrc = array;
    int[] currentDest = new int[array.length];

    int size = 1; // текцщий рахмер сливаемый значений
    while (size < array.length) {
      //пока размер сливаемых подмасивов меньше размера самого сортируемого
      for (int i = 0; i < array.length; i += 2 * size) {
        merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
      } // слияние массива размера size в массив size *2(в два раза больше чем оба исходных)

      //массив приемник и источник меняются местами с друго сдругом
      tmp = currentSrc;
      currentSrc = currentDest;
      currentDest = tmp;

      size = size * 2;

      System.out.println(Arrays.toString(currentSrc));
    }
    return currentSrc;
  }

  private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
      int destStart, int size) {

    int index1 = src1Start;
    int index2 = src2Start;

    //вычисляем концы массивов, с учетом границ родительского массива
    int src1End = Math.min(src1Start + size, src1.length);
    int src2End = Math.min(src2Start + size, src2.length);

    //сколько итерация для объединения
    int iterationCount = src1End - src1Start + src2End - src2Start;

    for (int i = destStart; i < destStart + iterationCount; i++) {
      if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
        dest[i] = src1[index1];
        index1++;
      } else {
        dest[i] = src2[index2];
        index2++;
      }
    }
  }
}


