package ru.compprog.linkedlist.vers4;

/**
 * Easy implementation without ds LinkedList
 */
public class Node {
  Node next = null;
  int data;

  public Node(int data) {
    this.data = data;
  }

  void add(int d) {
    Node end = new Node(d);
    Node n = this;
    while(n.next != null) {
      n = n.next;
    }
    n.next = end;
  }
}
