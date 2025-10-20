package br.edu.infnet.leandro_camargo_api.entities;

public class Expense extends Transaction {
  private String destination;

  public Expense(double amount, String description) {
    super(amount, description);
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }
}
