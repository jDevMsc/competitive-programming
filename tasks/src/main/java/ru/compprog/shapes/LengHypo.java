package ru.compprog.shapes;

/**
 * Using two legs introduced bu the user, calculate
 * the length of the hypotenuse
 */
public class LengHypo {

  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    //(Pythagoras c2 = a2 + b2) // c = sqrt(a2 + b2)
    float hypo = (float)(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    System.out.println(hypo);
  }
}
