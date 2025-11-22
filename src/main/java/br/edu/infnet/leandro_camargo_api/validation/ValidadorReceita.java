package br.edu.infnet.leandro_camargo_api.validation;

import br.edu.infnet.leandro_camargo_api.exceptions.StringVaziaException;
import br.edu.infnet.leandro_camargo_api.exceptions.ValorNegativoException;
import java.util.Scanner;

public class ValidadorReceita {

  public static double validaQuantiaReceita(Scanner kb, String mensagem) {
    while (true) {
      System.out.println(mensagem);
      try {
        double quantiaReceita = ValidadorInput.validaInputDouble(kb);
        if (quantiaReceita <= 0) {
          throw new ValorNegativoException("## QUANTIA INVALIDA - FAVOR INSERIR UMA"
              + " QUANTIA POSITIVA. ##");
        } else {
          return quantiaReceita;
        }
      } catch (ValorNegativoException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public static String validaFonteReceita(Scanner kb, String message) {
    while (true) {
      System.out.println(message);
      try {
        String fonte = kb.nextLine();
        if (fonte.isEmpty()) {
          throw new StringVaziaException("## FONTE INVÁLIDA - FAVOR INSERIR "
              + "UMA "
              + "FONTE PARA A RECEITA. ##");
        } else {
          return fonte;
        }
      } catch(StringVaziaException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
