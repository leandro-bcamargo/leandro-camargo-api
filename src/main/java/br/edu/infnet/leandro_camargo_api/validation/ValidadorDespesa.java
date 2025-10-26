package br.edu.infnet.leandro_camargo_api.validation;

public class ValidadorDespesa {
  public static void validaQuantiaDespesa(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("Favor inserir uma quantia positiva");
  }

  public static void validaDestinacao(String destinacao) {
    if (destinacao.isEmpty()) throw new IllegalArgumentException("Favor inserir uma destinação "
        + "para a "
        + " despesa.");
  }
}
