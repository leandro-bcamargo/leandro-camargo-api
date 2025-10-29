package br.edu.infnet.leandro_camargo_api.validation;

public class ValidadorDespesa {
  public static void validaQuantiaDespesa(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("## QUANTIA INVÁLIDA - FAVOR INSERIR UMA"
        + " QUANTIA POSITIVA. ##");
  }

  public static void validaDestinacao(String destinacao) {
    if (destinacao.isEmpty()) throw new IllegalArgumentException("## DESTINAÇÃO INVÁLIDA - "
        + "FAVOR INSERIR UMA DESTINAÇÃO PARA A DESPESA. ##");
  }
}
