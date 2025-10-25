package br.edu.infnet.leandro_camargo_api.services;

import br.edu.infnet.leandro_camargo_api.entities.Despesa;
import br.edu.infnet.leandro_camargo_api.entities.Receita;
import br.edu.infnet.leandro_camargo_api.entities.Transacao;
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
}
