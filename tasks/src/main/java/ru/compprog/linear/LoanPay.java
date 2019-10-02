package ru.compprog.linear;

/**
 * Calculate loan repayments. linear algorithm
 */
public class LoanPay {

  public static void main(String[] args) {
    int amountRoubles = 100_000;
    int year = 20;
    double procent = 10;

    double everyMonth ;
    double sumPay;

    everyMonth = ((amountRoubles * procent * Math.pow((1 + procent),year)) / (12 * (Math.pow((1+procent),year) - 1)));
    sumPay = (everyMonth * 12 * year);
    System.out.println("Ежемесячные выплаты - " + everyMonth + "руб");
    System.out.println("Всего будет выплачено - " + sumPay + "руб");
  }
}
