package ru.compprog.nestloop;

public class MultTable {

  public static void main(String[] args) {
    String string = "je";
    boolean ye = string.length()==string.toLowerCase().chars().distinct().count();

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
