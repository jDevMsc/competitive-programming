package ru.compprog.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Also we can use anon class without creating new Class
 */
public class TestComparator {

  public static void main(String[] args) {
    List<String> animals = new ArrayList<>();

    animals.add("dog");
    animals.add("cat");
    animals.add("frog");
    animals.add("birdd");

    // sort by length
    Collections.sort(animals, new StringLengthComparator());
    System.out.println(animals);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(0);
    numbers.add(500);
    numbers.add(100);

    Collections.sort(numbers, new NumberLengthComparator());
    System.out.println(numbers);

    List<Person> people = new ArrayList<>();
    Person man = new Person(1, "Dan");
    Person girl = new Person(2, "Lena");
    Person grandMa = new Person(3, "Rita");
    people.add(man);
    people.add(girl);
    people.add(grandMa);

    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getId() - o2.getId();
      }
    });
    System.out.println(people);
  }
}

//Comparator by string length
class StringLengthComparator implements Comparator<String> {

  /**
   * o1 > o2 => 1 o1 < o2 => -1 o1 == o2 => 0 compare(2, 1) => 1; compare(1, 2) => -1; compare(0, 0)
   * => 0;
   */
  @Override
  public int compare(String o1, String o2) {
    return o1.length() - o2.length();
  }
}

//Comparator by number
class NumberLengthComparator implements Comparator<Integer> {

  /**
   * sort by desc order
   */
  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1;
  }
}

class Person {

  private int id;
  private String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}