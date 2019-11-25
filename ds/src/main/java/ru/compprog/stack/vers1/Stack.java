package ru.compprog.stack.vers1;

public interface Stack<T> {

  void push(T item);
  T pop();

  boolean isEmpty();
}
