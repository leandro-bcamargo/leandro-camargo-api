package br.edu.infnet.leandro_camargo_api.entities;

import java.time.LocalDateTime;

public abstract class Transacao {
  private static Long contador = 0L;
  private final Long id;
  private double quantia;
  private String descricao;
  private LocalDateTime horario;

  public Transacao(double quantia, String descricao) {
    this.quantia = quantia;
    this.descricao = descricao;
    this.horario = LocalDateTime.now();
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

  public LocalDateTime getHorario() {
    return horario;
  }

  public void setHorario(LocalDateTime horario) {
    this.horario = horario;
  }
}
