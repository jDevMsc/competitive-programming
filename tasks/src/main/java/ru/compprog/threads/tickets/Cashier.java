package ru.compprog.threads.tickets;

public class Cashier extends Thread {

  int id;
  Ticket[] t;

  Cashier(int id, Ticket[] t) {
    this.id = id;
    this.t = t;
  }

  @Override
  public void run() {
    for (int i = 0; i < t.length; i++) {
      t[i].buy(this);
    }
    }
}
