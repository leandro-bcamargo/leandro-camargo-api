package br.edu.infnet.leandro_camargo_api.services;

import br.edu.infnet.leandro_camargo_api.entities.Despesa;
import br.edu.infnet.leandro_camargo_api.entities.Receita;
import br.edu.infnet.leandro_camargo_api.entities.Transacao;
import br.edu.infnet.leandro_camargo_api.ui.MenuDisplay;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinancas {

  private List<Transacao> transacoes = new ArrayList<>();

  public void adicionarReceita(Receita receita) {
    this.transacoes.add(receita);
  }

  public void adicionarDespesa(Despesa despesa) {
    this.transacoes.add(despesa);
  }

  public double getSaldo() {
    double receitas = transacoes.stream()
        .filter(tr -> tr instanceof Receita)
        .map(Transacao::getQuantia)
        .reduce(0.0, Double::sum);

    double despesas = transacoes.stream()
        .filter(tr -> tr instanceof Despesa)
        .map(Transacao::getQuantia)
        .reduce(0.0, Double::sum);

    return receitas - despesas;
  }

  public void imprimirExtrato() {
    if (transacoes.isEmpty()) {
      MenuDisplay.imprimeLinha();
      System.out.println("Não há transações registradas.");
      return;
    }
    this.transacoes.forEach(tr -> {
      MenuDisplay.imprimeLinha();
      System.out.println(tr.gerarEntradaExtrato());
    });
  }

  public void imprimirReceitas() {
    List<Transacao> receitas = this.transacoes.stream().filter(tr -> tr instanceof Receita).toList();
    if (receitas.isEmpty()) {
      MenuDisplay.imprimeLinha();
      System.out.println("Não há receitas registradas.");
      return;
    }
    receitas.forEach(tr -> {
      if (tr instanceof Receita) {
        MenuDisplay.imprimeLinha();
        System.out.println(tr.gerarEntradaExtrato());
      }
    });
  }

  public void imprimirDespesas() {
    List<Transacao> despesas =
        this.transacoes.stream().filter(tr -> tr instanceof  Despesa).toList();
    if (despesas.isEmpty()) {
      MenuDisplay.imprimeLinha();
      System.out.println("Não há despesas registradas.");
      return;
    }
    this.transacoes.forEach(tr -> {
      if (tr instanceof Despesa) {
        MenuDisplay.imprimeLinha();
        System.out.println(tr.gerarEntradaExtrato());
      }
    });
  }
}
