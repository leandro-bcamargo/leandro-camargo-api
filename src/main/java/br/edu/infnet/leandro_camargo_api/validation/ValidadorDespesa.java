package br.edu.infnet.leandro_camargo_api.validation;

import br.edu.infnet.leandro_camargo_api.exceptions.NaoDoubleException;
import br.edu.infnet.leandro_camargo_api.exceptions.StringVaziaException;
import br.edu.infnet.leandro_camargo_api.exceptions.ValorNegativoException;
import java.util.Scanner;

public class ValidadorDespesa {
  public static double validaQuantiaDespesa(Scanner kb, String message) {
    while (true) {
      System.out.println(message);
      try {
        double quantiaDespesa = ValidadorInput.validaInputDouble(kb);
        if (quantiaDespesa <= 0) {
          throw new ValorNegativoException(
              "## VALOR INVÁLIDO - FAVOR INSERIR UM VALOR POSITIVO ##");
        } else {
          return quantiaDespesa;
        }
      } catch (ValorNegativoException | NaoDoubleException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public static String validaDestinacao(Scanner kb, String message) {
    while (true) {
      System.out.println(message);
      try {
        String destinacao = kb.nextLine();
        if (destinacao.isEmpty()) {
          throw new StringVaziaException("## DESTINAÇÃO INVÁLIDA - "
              + "FAVOR INSERIR UMA DESTINAÇÃO PARA A DESPESA. ##");
        } else {
          return destinacao;
        }
      } catch(StringVaziaException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
