package ru.compprog.queue;

public class MyQueue<T> {
  private static class QueueNode<T> {
    private T data;
    private QueueNode<T> next;

    public QueueNode(T data) {
      this.data = data;
    }
  }

  private QueueNode<T> first;
  private QueueNode<T> last;

  public void add(T item) {
    QueueNode<T> t = new QueueNode<T>(item);
    if(last != null) {
      last.next = t;
    }
    last = t;
    if(first == null) {
      first = last;
    }
  }

}
