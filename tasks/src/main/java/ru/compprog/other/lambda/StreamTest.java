package ru.compprog.other.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

  public static void main(String[] args) {
    int[] array = new int[10];
    List<Integer> list = new ArrayList<>();

    fillArr(array);
    fillList(list);

    //mult *2
//    for (int i = 0; i < 10; i++) {
//      array[i] = array[i] *2;
//      list.set(i, list.get(i) * 2);
//    }

    //use lambda + map
    array = Arrays.stream(array).map(a -> a*2).toArray();
    list = list.stream().map(a -> a*2).collect(Collectors.toList());
    //map example 2
    array = Arrays.stream(array).map(a -> 3 + a).toArray();

    //filter  data
    int[] array2 = new int[10];
    List<Integer> list2 = new ArrayList<>();

    fillArr(array2);
    fillList(list2);

    array2 = Arrays.stream(array2).filter(a -> a % 2 == 0).toArray();
    list2 = list2.stream().filter(a -> a%2 ==0).collect(Collectors.toList());

    //forEach
    Arrays.stream(array2).forEach(System.out::println);
    list2.forEach(a -> System.out.println(a));

    //reduce - уменьшение
    int[] array3 = new int[10];
    List<Integer> list3 = new ArrayList<>();

    fillArr(array3);
    fillList(list3);
    //acc - accamulator b - current el
    int sim1 = Arrays.stream(array3).reduce((acc, b) -> acc + b).getAsInt();
    int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();
    int sim3 = Arrays.stream(array3).reduce(2,(acc, b) -> acc + b); //with start el

    //sequence
    int[] array4 = new int[10];
    fillArr(array4);
    array4 = Arrays.stream(array4).filter(a -> a%2 != 0).map(a -> a * 2).toArray();

    //Set
    Set<Integer> set = new HashSet<>(Arrays.asList(2,3,4));
    set = set.stream().map(a-> a* 2).collect(Collectors.toSet());
    System.out.println(set);


  }

  private static void fillList(List<Integer> list) {
    for (int i = 1; i < 10; i++) {
      list.add(i);
    }
  }

  private static void fillArr(int[] array) {
    for (int i = 0; i < 10; i++) {
      array[i] = i;
    }
  }


}
