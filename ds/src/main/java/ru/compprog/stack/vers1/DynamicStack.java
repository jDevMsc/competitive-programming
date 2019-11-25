package ru.compprog.stack.vers1;

public class DynamicStack {

  public static void main(String[] args) {
    StackImplUsingdynamicArray myStack = new StackImplUsingdynamicArray(2);
    myStack.push(5);
    myStack.push(8);
    System.out.println(myStack.isEmpty());
    System.out.println(myStack.peek());
  }
}

class StackImplUsingdynamicArray {

  private int maxSize;
  private int[] stackArray;
  private int top;

  public StackImplUsingdynamicArray(int maxSize) {
    this.maxSize = maxSize;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int value) {
    if (!isFull()) {
      top++;
      stackArray[top] = value;
    } else {
      resize(maxSize * 2);
      push(value);
    }
  }

  public int pop() {
    if(!isEmpty()) {
      return stackArray[top--];
    } else {
      System.out.println("The stack is already empty");
      return -1;
    }
  }

  public int peek() {
    if(!isEmpty()) {
      return stackArray[top];
    } else {
      System.out.println("The stack is empty, cant peek");
      return -1;
    }
  }

  public void resize(int newSize) {
    int[] transferArray = new int[newSize];

    for (int i = 0; i < stackArray.length; i++) {
      transferArray[i] = stackArray[i];
      stackArray = transferArray;
    }
    maxSize = newSize;
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top + 1 == maxSize);
  }

  public void makeEmpty() {
    top = -1;
  }
}