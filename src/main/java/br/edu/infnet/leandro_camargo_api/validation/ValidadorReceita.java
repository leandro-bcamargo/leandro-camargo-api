package br.edu.infnet.leandro_camargo_api.validation;

public class ValidadorReceita {
  public static void validaQuantiaReceita(double quantia) {
    if (quantia <= 0) throw new IllegalArgumentException("## QUANTIA INVALIDA - FAVOR INSERIR UMA"
        + " QUANTIA POSITIVA. ##");
  }

  public static void validaFonteReceita(String fonte) {
    if (fonte.isEmpty()) throw new IllegalArgumentException("## FONTE INVÁLIDA - FAVOR INSERIR "
        + "UMA "
        + "FONTE PARA A RECEITA. ##");
  }
}
