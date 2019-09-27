package ru.compprog.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Does not sort the array. Works as dynamic array.
 * Can get the item by index
 */
public class ArrayListView {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();

    strings.add("abc");
    strings.add("aaa");
    strings.add("ccc");

    for(String s : strings) {
      System.out.println(s);
    }

    System.out.println(strings.get(0));

    System.out.println(strings.size());

    strings.remove(0);
    //When deleted, everything moves one left
    System.out.println(strings.get(0));
    strings.remove("aaa");
    System.out.println(strings.size());
    strings.clear();
    System.out.println(strings.size());
    strings.add("aaa");
    strings.add("ccc");
    System.out.println(strings.get(0));

    strings.set(0,"set");
    System.out.println(strings.get(0));







  }
}
