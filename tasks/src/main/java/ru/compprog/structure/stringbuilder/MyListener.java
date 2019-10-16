package ru.compprog.structure.stringbuilder;

public class MyListener  implements StringBuilderListener {

  @Override
  public void onChange(OvservStringBuilder stringBuilder) {
    System.out.println("CHANGED: " + stringBuilder.toString());
  }
}
