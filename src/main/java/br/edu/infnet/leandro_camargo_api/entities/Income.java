package br.edu.infnet.leandro_camargo_api.entities;

public class Income extends Transaction {
  private String source;

  public Income(double amount, String description) {
    super(amount, description);
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
}
