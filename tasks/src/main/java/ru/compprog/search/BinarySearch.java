package ru.compprog.search;

/**
 * Массив должен быть отсортирован
 * O(logn)
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
    System.out.println();
  }

  public static int searchBinaryRecursive(int array[], int startIndex, int endIndex,int elementToFind ) {
    if(endIndex >= startIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if(array[middleIndex] == elementToFind) {
        return  middleIndex;
      }

      if(array[middleIndex] > elementToFind) {
        return  searchBinaryRecursive(array, startIndex, middleIndex-1, elementToFind);
      } else {
        return  searchBinaryRecursive(array, middleIndex + 1, endIndex, elementToFind);
      }
    }
    return -1;
  }

  public static int searchBinary(int[] array, int elementToFind) {
    int startIndex = 0;
    int endIndex = array.length -1;
    int middleIndex;
    while(startIndex <= endIndex) {
      middleIndex = startIndex + (endIndex - startIndex) / 2;

      if(array[middleIndex] == elementToFind) {
        return middleIndex;
      }
      if(array[middleIndex] > elementToFind) {
        endIndex = middleIndex - 1;
      } else {
        startIndex = middleIndex + 1;
      }
    }
    return  -1;
  }
}
