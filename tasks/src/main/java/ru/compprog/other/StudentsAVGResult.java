package ru.compprog.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Identify students with a result above average
 */
public class StudentsAVGResult {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    Student[] students = new Student[num];
    int avg  = 0;
    for (int i = 0; i < num; i++) {
      System.out.println("Выедите имя и баллы");
      students[i] = new Student(reader.readLine(), Integer.parseInt(reader.readLine()));
      avg = avg + (students[i].result / num);
          }

    for(Student student : students) {
      if(student.result > avg) {
        System.out.println(student.name);
      }
    }
  }
}

class Student {
  String name;
  int result;

  public Student(String name, int result) {
    this.name = name;
    this.result = result;
  }
}
