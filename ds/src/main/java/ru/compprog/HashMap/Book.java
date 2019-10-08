package ru.compprog.HashMap;

import java.util.Objects;

public class Book {

  int id;
  int countSheet;
  String Title;

  @Override
  public boolean equals(Object o) {
    if (this == o) { //равны ли указатели ссылки
      return true;
    }
    if (o == null || getClass() != o.getClass()) { //равенство классов
      return false;
    }
    Book book = (Book) o;
    return id == book.id &&
        countSheet == book.countSheet &&
        Objects.equals(Title, book.Title);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + countSheet;
    result = prime * result + id;
    return result;
  }
}
