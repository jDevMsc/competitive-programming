package ru.compprog.stack.vers1;


public class ArrayStack {

  protected int capacity;
  public static final int CAPACITY = 16;
  protected int[] stackArray;
  protected int top = -1;

  public ArrayStack() {
    this(CAPACITY);
  }

  public ArrayStack(int capacity) {
    this.capacity = capacity;
    stackArray = new int[capacity];
  }

  public int size() {
    return top + 1;
  }

  public boolean isEmpty() {
    return top < 0;
  }

  public void push(int data) throws Exception {
    if (size() == capacity) {
      throw new Exception("Stack is full");
    }
    stackArray[++top] = data;
  }

  public int top() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    }
    return stackArray[top];

  }

  public int pop() throws Exception {
    int data;
    if (size() == capacity) {
      throw new Exception("Stack is full");
    }
    data = stackArray[top];
    stackArray[top--] = Integer.MIN_VALUE;
    return data;
  }

  public String toString() {
    String s;
    s = "[";
    if (size() > 0) {
      s += stackArray[0];
    }
    if (size() > 1) {
      for (int i = 1; i <= size() - 1; i++) {
        s += ", " + stackArray[i];
      }
    }
    return s + "]";
  }

}
class Program {

  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(2);
    try {
      stack.push(5);
      stack.push(8);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Print stack elements before pop(): " + stack.toString());
  }
}