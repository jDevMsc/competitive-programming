package ru.compprog.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of sets in set
 */
public class SetsPractise {

  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    set1.add(0);
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);

    Set<Integer> set2 = new HashSet<>();
    set2.add(2);
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);
    set2.add(7);

    //union
    Set<Integer> union = new HashSet<>(set1);
    union.addAll(set2);

    //intersection
    Set<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);

    //difference
    Set<Integer> difference= new HashSet<>(set1);
    difference.removeAll(set2);

  }

}
