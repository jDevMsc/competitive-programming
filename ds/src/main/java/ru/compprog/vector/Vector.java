package ru.compprog.vector;

/**
 * Create Vector according conditions
 */
public class Vector {

  private double x;
  private double y;
  private double z;


  public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double lengthVector() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2) + Math.pow(x, 2));
  }

  public Vector crossProduct(Vector vector) {
    return new Vector(
        this.y * vector.z - this.z * vector.y,
        this.z * vector.x - this.x * vector.z,
        this.x * vector.y - this.y * vector.x);
  }

  public double scalar(Vector vector) {
    return this.x * vector.getX() + this.y * vector.getY() + this.z * vector.getZ();
  }

  public double getCos(Vector vector) {
    return (this.scalar(vector)) / this.lengthVector() * vector.lengthVector();
  }

  public Vector add(Vector vector) {
    return new Vector(
        x + vector.x,
        y + vector.y,
        z + vector.z
    );
  }

  public Vector subtract(Vector vector) {
    return new Vector(
        x - vector.x,
        y - vector.y,
        z - vector.z
    );
  }

  public static Vector[] getArray(int n) {
    Vector[] result = new Vector[n];
    for (int i = 0; i < n; i++) {
        result[i] = new Vector(Math.random(), Math.random(), Math.random());
    }
    return result;
  }

  public double getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  @Override
  public String toString() {
    return "Vector{" +
        "x=" + x +
        ", y=" + y +
        ", z=" + z +
        '}';
  }
}
