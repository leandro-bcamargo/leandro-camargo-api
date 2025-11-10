package br.edu.infnet.leandro_camargo_api.entities;

import br.edu.infnet.leandro_camargo_api.ui.Formatador;
import br.edu.infnet.leandro_camargo_api.ui.MenuPrincipal;
import java.time.LocalDateTime;

public abstract class Transacao {
  private static Long contador = 0L;
  private final Long id;
  private double quantia;
  private String descricao;
  private LocalDateTime dataHora;

  public Transacao(double quantia, String descricao) {
    this.quantia = quantia;
    this.descricao = descricao;
    this.dataHora = LocalDateTime.now();
    contador++;
    this.id = contador;
  }

  public static Long getContador() {
    return contador;
  }

  public static void setContador(Long contador) {
    Transacao.contador = contador;
  }

  public Long getId() {
    return id;
  }

  public double getQuantia() {
    return quantia;
  }

  public void setQuantia(double quantia) {
    this.quantia = quantia;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public String gerarEntradaExtrato() {
    String tipoDeTransacao = this.getClass().getSimpleName();
    return String.format("Transação Id: %d\n"
            + "Tipo de Transação: %s\n"
            + "Quantia: R$ %.2f\n"
            + "%s: %s\n"
            + "Data e Horário: %s", this.getId(), tipoDeTransacao, this.getQuantia(),
        tipoDeTransacao.equals("Despesa") ? "Destinação" : "Fonte", this.getDescricao(),
        Formatador.formatarDataHora(this.getDataHora()));
  }
}
