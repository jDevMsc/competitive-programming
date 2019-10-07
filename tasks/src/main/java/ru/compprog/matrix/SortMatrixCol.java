package ru.compprog.matrix;

/**
 * Sort matrix columns in ascending order by the elements of the forst row
 */
public class SortMatrixCol {

  public static void main(String[] args) {
    int[][] matrix = {{3, -2, 6, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {22, 45, 88, 66}};

    int length = matrix.length - 1;

    while (length > 0) {
      int id = 0;
      for (int j = 1; j <= length; j++) {
        if (matrix[0][j] > matrix[0][id]) { //ищем наибольший столбец
          id = j;
        }
      }
      for (int i = 0; i < matrix.length; i++) { //меняем макс с посл колонкой и уменьшаем на 1
        int max = matrix[i][id];
        matrix[i][id] = matrix[i][length];
        matrix[i][length] = max;
      }
      length -= 1;

    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  }
}
