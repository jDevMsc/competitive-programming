package ru.compprog.stack;

public class Program {

  public static void main(String[] args)  {
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
