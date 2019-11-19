package ru.compprog.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Filling with objects
 */

public class GreedyThings {

  public static void main(String[] args) {
    final Item item1 = new Item(4, 20);
    final Item item2 = new Item(3, 18);
    final Item item3 = new Item(2, 14);

    final Item[] items = {item1, item2, item3};
    //O(N *log*N)
    Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitWeight).reversed());
    System.out.println(Arrays.toString(items));

    final int W = 7;

    int weightSoFar = 0; //weight current
    int valueSoFar = 0; //value current
    int currentItem = 0; // ind current item1


    while(currentItem < items.length && weightSoFar != W) {
      if(weightSoFar + items[currentItem].getWeight() < W) {
        //take whole item
        valueSoFar += items[currentItem].getValue();
        weightSoFar += items[currentItem].getWeight();
      } else {
        //take part of item
        valueSoFar += ((W - weightSoFar) / (double)items[currentItem].getWeight()) * items[currentItem].getValue();
        weightSoFar = W; //filled
      }

      currentItem++;
    }

    System.out.println("Value of the best set :" + valueSoFar);
  }
}

class Item {

  private int weight;
  private int value;

  public Item(int weight, int value) {
    this.weight = weight;
    this.value = value;
  }

  public double valuePerUnitWeight() {
    return value / (double) weight;
  }

  @Override
  public String toString() {
    return "Item{" +
        "weight=" + weight +
        ", value=" + value +
        '}';
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
