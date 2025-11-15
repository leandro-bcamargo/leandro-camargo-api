package br.edu.infnet.leandro_camargo_api.ui;

public class MenuDisplay {
  public static void imprimeMenuPrincipal() {
    imprimeLinha();
    System.out.println("GERENCIADOR DE FINANCAS PESSOAIS");
    imprimeLinha();
    System.out.println("1 - Inserir Despesa");
    System.out.println("2 - Inserir Receita");
    System.out.println("3 - Consultar Saldo");
    System.out.println("4 - Consultar Receitas");
    System.out.println("5 - Consultar Despesas");
    System.out.println("6 - Consultar Extrato Completo");
    System.out.println("0 - Sair");
    System.out.println("Digite a opção desejada:");
  }

  public static void imprimeLinha() {
    System.out.println(
        "================================================================================");
  }
}
