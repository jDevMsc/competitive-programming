package ru.compprog.branch;

/**
 * Greatest common divisor
 */
public class NOD {

  public static void main(String[] args) {

    int first = 9;
    int second = 7;
    int length;
    int nod = 0;

    length = first > second ? second : first;

    for (int i = 2; i < length; i++) {
      if (first % i == 0 && second % i == 0) {
        nod = i;
      }
    }
      if( nod == 0) {
        System.out.println("Числа не имеют общий делитель");
    } else {
        System.out.println("Наибольший общий делитель = " + nod);
      }
  }
}
