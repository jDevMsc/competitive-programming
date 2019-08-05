package ru.compprog.nestloop;

public class MultTable {

  public static void main(String[] args) {

    int[][] multTable = new int[10][10];
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        multTable[i][j] = i * j;
        System.out.printf("%3d", multTable[i][j]);
      }
      System.out.printf("\n");
    }
  }
}
