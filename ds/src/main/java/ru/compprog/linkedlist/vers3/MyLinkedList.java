package ru.compprog.linkedlist.vers3;

import java.util.Arrays;

public class MyLinkedList {

  private Node head;
  private int size;

  public void add(int value) {
    //if first add
    if (head == null) {
      this.head = new Node(value);
    } else {

      //indicates to last element
      //{1} ->{2}->{3}
      Node temp = head;
      while (temp.next != null) {
        temp = temp.getNext();
      }
      temp.setNext(new Node(value));
    }
    size++;
  }

  public String toString() {
    int[] result = new int[size];
    int idx = 0;

    Node temp = head;
    while (temp != null) {
      result[idx++] = temp.getValue();
      temp = temp.getNext();
    }
    return Arrays.toString(result);
  }

  public int get(int index) {
    int current = 0;
    Node temp = head;
    while (head != null) {
      if (current == index) {
        return temp.getValue();
      } else {
        temp = temp.getNext();
        current++;
      }
    }
    throw new IllegalArgumentException();
  }

  public void remove(int index) {

    if(index == 0) {
      head = head.getNext();
      size--;
      return;
    }

    int current = 0;
    Node temp = head;

    while (temp != null) {
      if ((current + 1) == index) {
        temp.setNext(temp.getNext().getNext());
        size--;
        return;
      } else {
        temp = temp.getNext();
        current++;
      }
    }
  }


  private static class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }

}
