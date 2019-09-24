package ru.compprog.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Goods {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Item[] items = {new Item("Яблоки", 25), new Item("Овощи", 44), new Item("Фрукты", 100)};
    System.out.println(Arrays.toString(items));

    while(true) {
      System.out.println("Введите номер товара и егоновую цену");
      String choiсe = reader.readLine();
      if(choiсe.equals("q")) {
        break;
      }
      switch(choiсe) {
        case "1" :
          items[0].price = Integer.parseInt(reader.readLine());
          break;
        case "2" :
          items[1].price = Integer.parseInt(reader.readLine());
          break;
        case "3" :
          items[2].price = Integer.parseInt(reader.readLine());
          break;
      }
      System.out.println(Arrays.toString(items));
    }
  }

}

class Item {
  String name;
  int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
