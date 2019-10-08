package ru.compprog.HashMap;


import java.util.LinkedList;
import java.util.List;

public class ReferenceBook<K,V> {

  private Node<K,V>[] hashTable;
  private int size = 0;
  private float threshold;

  private int hash(final K key) {
    int hash = 31;
    hash = hash * 17 * key.hashCode();
    return hash % hashTable.length;
  }

  private class Node<K,V> {
    private List<Node<K,V>> nodes;
    private int hash;
    private K key;
    private V value;

    private Node(K key, V value) {
      this.key = key;
      this.value = value;
      nodes = new LinkedList<Node<K,V>>();
    }

    private List<Node<K,V>> getNodes() {
      return nodes;
    }

    private int hash() {
      return hashCode() % hashTable.length;
    }

    private K getKey() {
      return key;
    }
    private V getValue() {
      return value;
    }
  }
}
