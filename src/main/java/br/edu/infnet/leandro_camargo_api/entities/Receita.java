package br.edu.infnet.leandro_camargo_api.entities;

public class Receita extends Transacao {
  private String fonte;

  public Receita(double amount, String description) {
    super(amount, description);
  }

  public String getFonte() {
    return fonte;
  }

  public void setFonte(String fonte) {
    this.fonte = fonte;
  }
}
