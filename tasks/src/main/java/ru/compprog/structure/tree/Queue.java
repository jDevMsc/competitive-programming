package ru.compprog.structure.tree;

public interface Queue<T> {

  void add(T item); //add in end
  T remove();   // extract from the beginning

  boolean isEmpty();
}
