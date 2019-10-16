package ru.compprog.structure.stringbuilder;

public class OvservStringBuilder {
  private StringBuilderListener onChangeListener;
  private StringBuilder stringBuilder;

  public void setOnChangeListener(StringBuilderListener onChangeListener) {
    this.onChangeListener = onChangeListener;
  }

  public OvservStringBuilder() {
    stringBuilder = new StringBuilder();
  }

  private void notifyOnStringBuilderChangeListener(){
    if(onChangeListener != null){
      onChangeListener.onChange(this);
    }
  }

  public OvservStringBuilder append(Object obj) {
    stringBuilder.append(obj);
    notifyOnStringBuilderChangeListener();
    return this;
  }

  public OvservStringBuilder replace(int start, int end, String str) {
    stringBuilder.replace(start, end, str);
    notifyOnStringBuilderChangeListener();
    return this;
  }

  public OvservStringBuilder insert(int index, char[] str, int offset, int len) {
    stringBuilder.insert(index, str, offset, len);
    notifyOnStringBuilderChangeListener();
    return this;
  }

  public String toString() {
    return stringBuilder.toString();
  }
}
