package ru.compprog.structure.vector;

public class VectorArray {

  private double[] values;

  public VectorArray(double[] values) {
    this.values = values;
  }

  public double length() {
    double sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i] * values[i];
    }
    return Math.sqrt(sum);
  }

  public double scalarProduct(VectorArray vector) {
    double res = 0;

    for (int i = 0; i < values.length; i++) {
      res += values[i] * vector.values[i];
    }
    return res;
  }

  public double cos(VectorArray vector) {
    return scalarProduct(vector) / (length() * vector.length());
  }

  public VectorArray add(VectorArray vector) {
    double[] another = new double[values.length];

    for (int i = 0; i < values.length; i++) {
      another[i] = values[i] + vector.values[i];
    }
    return new VectorArray(another);
  }

  public VectorArray subtract(VectorArray vector) {
    double[] another = new double[values.length];

    for (int i = 0; i < values.length; i++) {
      another[i] = values[i] - vector.values[i];
    }
    return new VectorArray(another);
  }
  //array for
  private static double[] generateRandomArray(int length) {
    double[] array = new double[length];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.random();
    }
    return array;
  }

  public static VectorArray[] generate(int n, int dimension) {
    VectorArray[] vectors = new VectorArray[n];
    for (int i = 0; i < n; i++) {
      vectors[i] = new VectorArray(generateRandomArray(dimension));
    }
    return vectors;
  }

}
