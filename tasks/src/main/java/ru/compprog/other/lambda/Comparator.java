package ru.compprog.other.lambda;

import java.util.ArrayList;
import java.util.List;

public class Comparator {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("Goodbye");
    list.add("Test");
    list.add("Me");
    System.out.println(list);
    
      //1
//    list.sort(new java.util.Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    });

    //2
    list.sort((o1,o2) -> o1.length() - o2.length());
    System.out.println(list);

  }
}
