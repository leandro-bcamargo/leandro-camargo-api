package br.edu.infnet.leandro_camargo_api.validation;

import br.edu.infnet.leandro_camargo_api.exceptions.NaoDoubleException;
import br.edu.infnet.leandro_camargo_api.exceptions.NaoInteiroException;
import br.edu.infnet.leandro_camargo_api.exceptions.NaoLongException;
import java.util.Scanner;

public class ValidadorInput {
  public static int validaInputInt(Scanner kb) throws NaoInteiroException {
    while (true) {
      try {
        return Integer.parseInt(kb.nextLine());
      } catch(RuntimeException e) {
      throw new NaoInteiroException("## ENTRADA INVÁLIDA - FAVOR INSERIR UM NÚMERO INTEIRO. ##");
    }
  }
}

public static double validaInputDouble(Scanner kb) throws NaoDoubleException {
  while (true) {
    try {
      return Double.parseDouble(kb.nextLine());
    } catch (RuntimeException e) {
      throw new NaoDoubleException("## ENTRADA INVÁLIDA - FAVOR INSERIR UM NÚMERO DOUBLE. ##");
    }
  }
}

public static Long validaInputLong(Scanner kb) throws NaoLongException {
    while (true) {
      try {
        return Long.parseLong(kb.nextLine());
      } catch (RuntimeException e) {
        throw new NaoLongException("## ENTRADA INVÁLIDA - FAVOR INSERIR UM NÚMERO LONG. ##");
      }
    }
}
}
