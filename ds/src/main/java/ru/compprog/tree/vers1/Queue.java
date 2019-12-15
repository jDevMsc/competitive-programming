package ru.compprog.tree.vers1;

public interface Queue<T> {

  void add(T item); //add in end
  T remove();   // extract from the beginning

  boolean isEmpty();
}
