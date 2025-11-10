package br.edu.infnet.leandro_camargo_api.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MenuPrincipal {
  public static void imprimeMenuPrincipal() {
    imprimeLinha();
    System.out.println("GERENCIADOR DE FINANCAS PESSOAIS");
    imprimeLinha();
    System.out.println("1 - Inserir Despesa");
    System.out.println("2 - Inserir Receita");
    System.out.println("3 - Consultar Saldo");
    System.out.println("4 - Consultar Extrato");
    System.out.println("0 - Sair");
    System.out.println("Digite a opção desejada:");
  }

  public static void imprimeLinha() {
    System.out.println(
        "================================================================================");
  }
}
