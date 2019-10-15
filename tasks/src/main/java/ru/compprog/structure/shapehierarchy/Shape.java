package ru.compprog.structure.shapehierarchy;

public abstract class Shape {

  private double volume;

  public Shape(double volume) {
    this.volume = volume;
  }

  public double getVolume() {
    return volume;
  }

}
