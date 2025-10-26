package br.edu.infnet.leandro_camargo_api.validation;

public class ValidadorReceita {
  public static void validaQuantiaReceita(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("Favor inserir uma quantia positiva");
  }

  public static void validaFonteReceita(String fonte) {
    if (fonte.isEmpty()) throw new IllegalArgumentException("Favor inserir uma fonte para a "
        + "receita.");
  }
}
