package br.edu.infnet.leandro_camargo_api.entities;

public class Despesa extends Transacao {

  public Despesa(double quantia, String destinacao) {
    super(quantia, destinacao);
    this.validaQuantiaDespesa(quantia);
    this.validaDestinacao(destinacao);
  }

  public void validaQuantiaDespesa(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("Favor inserir uma quantia positiva");
  }

  public void validaDestinacao(String destinacao) {
    if (destinacao.isEmpty()) throw new IllegalArgumentException("Favor inserir uma destinação "
        + "para a "
        + " despesa.");
  }
}
