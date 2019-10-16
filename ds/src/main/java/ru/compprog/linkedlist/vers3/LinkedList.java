package ru.compprog.linkedlist.vers3;

class LinkedList {

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
    }
  }

  public static LinkedList insert(LinkedList list, int data) {
    Node new_node = new Node(data);
    new_node.next = null;
    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }
      last = new_node;
    }
    return list;
  }


  public static void printList(LinkedList list) {
    Node current = list.head;
    System.out.println("Linked list :");
    while (current.next != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }

  public static LinkedList deleteByKey(LinkedList list, int key) {
    Node current = list.head;
    Node prev = null;

    //if head
    if (current != null && current.data == key) {
      list.head = current.next;
      System.out.println(key + " found and deleted");
      return list;
    }

    //if not head
    while (current != null && current.data != key) {
      prev = current;
      current = current.next;
    }
    if (current != null) {
      prev.next = current.next;
      System.out.println(key + " found and deleted");
      return list;
    }

    //not found
    if (current == null) {
      System.out.println(key + " not found");
    }
    return list;
  }


  public static LinkedList deleteByPos(LinkedList list, int index) {
    Node current = list.head;
    Node prev = null;

    if (index == 0 && current != null) {
      list.head = current.next;
      System.out.println(index + " position element deleted");
      return list;
    }

    int counter = 0;
    while (current != null) {
      if (counter == index) {
        prev.next = current.next;
        System.out.println(index + " position element deleted");
        break;
      } else {
        prev = current;
        current = current.next;
        counter++;
      }
    }

    if(current == null) {
      System.out.println(index + " position element not found");
    }
    return list;
  }

}