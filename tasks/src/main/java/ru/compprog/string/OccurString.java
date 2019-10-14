package ru.compprog.string;

/**
 *Number of occurrences of one row in another.
 */
public class OccurString {

  public static void main(String[] args) {
    String one = "All hello We Want to hello hello";
    String two = "hello";

    int oneLeng = one.length();
    int twoLeng = two.length();
    int resultLeng = one.replace(two, "").length();

    System.out.println((oneLeng - resultLeng)/twoLeng);
  }
}
