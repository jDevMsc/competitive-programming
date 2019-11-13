package ru.compprog.linkedlist.vers3;

public class Test {

  public static void main(String[] args) {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.add(5);
    linkedList.add(2);
    linkedList.add(20);
    System.out.println(linkedList);

    System.out.println(linkedList.get(0));

    linkedList.remove(1);
    System.out.println(linkedList);

  }
}
