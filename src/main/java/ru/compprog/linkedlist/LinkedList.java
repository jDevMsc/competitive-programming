package ru.compprog.linkedlist;

import java.util.*;

public class LinkedList
{
   public Node head;
   public Node tail;

   public LinkedList()
   {
      head = null;
      tail = null;
   }

   public void addInTail(Node item) {
      if (this.head == null)
         this.head = item;
      else
         this.tail.next = item;
      this.tail = item;
   }

   public Node find(int value) {
      Node node = this.head;
      while (node != null) {
         if (node.value == value)
            return node;
         node = node.next;
      }
      return null;
   }

   public ArrayList<Node> findAll(int _value) {
      ArrayList<Node> nodes = new ArrayList<Node>();
      return nodes;
   }

   public boolean remove(int _value)
   {
      Node node = this.head;
      while (node != null) {
         if (node.value == _value)
            return true;
         node = node.next;
      }

      return false; // если узел был удалён
   }

}

class Node
{
   public int value;
   public Node next;
   public Node(int _value)
   {
      value = _value;
      next = null;
   }
}