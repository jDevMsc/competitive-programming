package ru.compprog.other.lambda;


interface Executable2 {
  int execute(int x, int y);
}

public class LambdaTest2 {
  public static void main(String[] args) {
    final int s = 1; //must be final or effectively final, no change

    Runner2 run = new Runner2( );
    run.run(new Executable2() {
      @Override
      public int execute(int x, int y) {
        System.out.println("Lambda");
        int s = 10; //we can create new field
        return 1 + x + y +s;
      }
    });
    run.run((x, y) -> {
      int s2 = 22; //can create field but with another name
      return 5 + x + y + s + s2;
    });
  }
}

class Runner2 {
  public void run(Executable2 e) {
    int a = e.execute(10, 15);
    System.out.println(a);
  }
}