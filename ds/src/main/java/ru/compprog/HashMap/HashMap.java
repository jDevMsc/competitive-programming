package ru.compprog.HashMap;

import java.util.ArrayList;
import java.util.Set;

public class HashMap<T, E> {

  private HashMap<T, ArrayList<E>> map = new HashMap<>();

  public void put(T key, E item) {
    if (!map.containsKey(key)) {
      map.put(key, new ArrayList<E>());
    }
    map.get(key).add((ArrayList<E>) item);
  }

  public void put(T key, ArrayList<E> items) {
    map.put(key, items);
  }

  public ArrayList<E> get(T key) {
    return (ArrayList<E>) map.get(key);
  }

  public boolean containsKey(T key) {
    return map.containsKey(key);
  }

  public boolean containsKeyValue(T key, E value) {
    ArrayList<E> list = get(key);
    if(list == null) return false;
    return list.contains(value);
  }
  public Set<T> keySet() {
    return map.keySet();
  }

  @Override
  public String toString() {
    return map.toString();
  }
}
