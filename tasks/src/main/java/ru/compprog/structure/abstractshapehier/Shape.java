package ru.compprog.structure.abstractshapehier;

public interface Shape extends Comparable<Shape> {
  double getVolume();

  @Override
  default int compareTo(Shape other) {
    return Double.compare(getVolume(), other.getVolume());
  }
}
