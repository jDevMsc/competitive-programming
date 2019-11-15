package ru.compprog.other;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {

  public static void main(String[] args) {
    List<PersonTest> personList = new ArrayList<>();
    Set<Person> personSet = new TreeSet<>(); //want to sort in herself , error if not impl Comparable

    addElements(personList);
    addElements(personSet);

    System.out.println(personList);
    System.out.println(personSet);

  }

  private static void addElements(Collection collection){
    collection.add(new PersonTest(2, "Bob"));
    collection.add(new PersonTest(3, "Vlad"));
    collection.add(new PersonTest(1, "Ninaa"));
    collection.add(new PersonTest(4, "Djeckkk"));
  }

}

class PersonTest implements Comparable<PersonTest> {
  private int id;
  private String name;

  public PersonTest(int id, String name) {
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
  public int compareTo(PersonTest o) {
    return this.id - o.getId();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonTest personTest = (PersonTest) o;
    return id == personTest.id &&
        Objects.equals(name, personTest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "PersonTest{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

