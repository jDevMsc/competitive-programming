package ru.compprog.stringbuilder;

public class Main {

  public static void main(String[] args) {
    OvservStringBuilder stringBuilder =  new OvservStringBuilder();
    stringBuilder.setOnChangeListener(new MyListener());
    stringBuilder.append("Hello");
    stringBuilder.append(", ");
    stringBuilder.append("World!");
  }

}
