package ru.compprog.structure.abstractshapehier;

class Pyramid implements Shape {
  private double height;
  private double s;

  public Pyramid(double height, double s) {
    this.height = height;
    this.s = s;
  }

  @Override
  public double getVolume() {
    return height * s * 4 / 3;
  }
}