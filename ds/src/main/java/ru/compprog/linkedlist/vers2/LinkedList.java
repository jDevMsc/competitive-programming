package ru.compprog.linkedlist.vers2;

public class LinkedList {

  int size;
  private Node first;
  private Node last;

  public void add(int element) {
    Node newNode = new Node(element);
    if (first == null) {
      newNode.next = null;
      newNode.previous = null;
      first = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      newNode.previous = last;
      last = newNode;
    }
    size++;
  }

  public void add(int index, int element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node newNode = new Node(element);
    if (index == 0) {
      add(element);
    }
    if (index == size) {
      last.next = newNode;
      last = newNode;
    }
    Node oldNode = first;
    for (int i = 0; i < index; i++) {
      oldNode = oldNode.next;
    }
    Node oldPrevious = oldNode.previous;
    oldPrevious.next = newNode;
    oldNode.previous = newNode;

    newNode.previous = oldPrevious;
    newNode.next = oldNode;
    size++;
  }


  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node result = first;
    for (int i = 0; i < index; i++) {
      result = result.next;
    }

    return result.element;
  }





}
