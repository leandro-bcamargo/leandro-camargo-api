package br.edu.infnet.leandro_camargo_api.entities;

public class Despesa extends Transacao {
  private String destinacao;

  public Despesa(double quantia, String destinacao) {
    super(quantia, destinacao);
  }

  public String getDestinacao() {
    return destinacao;
  }

  public void setDestinacao(String destinacao) {
    this.destinacao = destinacao;
  }
}
