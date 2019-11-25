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

  Node delete(Node head, int d) {
    Node n = head;
    if(n.data == d) {
      return head.next;
    }
    while(n.next != null) {
      if(n.next.data == d) {
        n.next = n.next.next;
        return head;
      }
      n = n.next;
    }
    return head;
  }
}
