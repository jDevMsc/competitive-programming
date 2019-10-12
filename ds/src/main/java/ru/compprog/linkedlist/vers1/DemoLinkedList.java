package ru.compprog.linkedlist.vers1;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

  public static void main(String[] args) {
    List<String>list = new LinkedList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");

    String s = list.get(1);
    System.out.println(s);

    System.out.println(list.size());

    for (String str :list ) {
      System.out.println(str);
    }
    System.out.println("==========");

    for(Object alist : list) {
      System.out.println(alist);
    }

    System.out.println("==========");

    list.remove(1);
    System.out.println(list.get(1));

    list.remove("d");

    System.out.println(list.size());

    list.set(0,"SET");
    System.out.println(list.contains("a"));

  }
}
