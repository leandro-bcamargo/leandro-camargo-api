package br.edu.infnet.leandro_camargo_api.entities;

public class Receita extends Transacao {

  public Receita(double quantia, String fonte) {
    super(quantia, fonte);
    this.validaQuantiaReceita(quantia);
    this.validaFonteReceita(fonte);
  }

  public void validaQuantiaReceita(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("Favor inserir uma quantia positiva");
  }

  public void validaFonteReceita(String fonte) {
    if (fonte.isEmpty()) throw new IllegalArgumentException("Favor inserir uma fonte para a "
        + "receita.");
  }
}
