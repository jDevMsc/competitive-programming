package ru.compprog.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("a", "b");
    //переписывсает по одинаковому ключу
    map.put("a", "d");

    String s = map.get("a");
    System.out.println(s);

    System.out.println(map.containsKey("a"));
    System.out.println(map.containsValue("b"));
    System.out.println(map.containsValue("d"));

    System.out.println(map.remove("a"));
    System.out.println(map.containsKey("a"));

    System.out.println(map.put("b","c"));
    System.out.println(map.put("e","e"));
    System.out.println(map.size());

    System.out.println(map.getOrDefault("a","c"));


    System.out.println(map.replace("b", "change"));

    System.out.println(map.entrySet());
    System.out.println(map.keySet());
    System.out.println(map.values());

  }
}
