package br.edu.infnet.leandro_camargo_api.validation;

import br.edu.infnet.leandro_camargo_api.ui.MenuPrincipal;
import java.util.Scanner;

public class ValidadorInput {
  public static int validaInputInt(Scanner kb, String mensagem) {
    while (true) {
      if (!mensagem.isEmpty()) System.out.println(mensagem);
      try {
        return Integer.parseInt(kb.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("## ENTRADA INVÁLIDA - FAVOR INSERIR UM NÚMERO INTEIRO. ##");
        MenuPrincipal.imprimeMenuPrincipal();
      }
    }
  }

  public static double validaInputDouble(Scanner kb, String mensagem) {
    while (true) {
      if (!mensagem.isEmpty()) System.out.println(mensagem);
      try {
        return Double.parseDouble(kb.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("## ENTRADA INVÁLIDA - FAVOR INSERIR UM NÚMERO DOUBLE. ##");
        MenuPrincipal.imprimeMenuPrincipal();
      }
    }
  }
}
