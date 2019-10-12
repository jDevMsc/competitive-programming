package ru.compprog.shapes.ShapeHierarchy;

public class Cylinder  extends SolidOfRevolution{
  private double height;

  public Cylinder(double radius, double height) {
    super(Math.PI * radius * radius * height, radius);
    this.height = height;
  }
}
