package ru.compprog.threads.tickets;

public class Ticket {
  boolean isBought;
  int place;

  public Ticket(int place) {
    this.place = place;
  }
  synchronized void buy(Cashier c) {
    if(!isBought) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      isBought = true;
      System.out.println("Cashier " + c.id + " ticket " + this.place);
    }
  }
}
