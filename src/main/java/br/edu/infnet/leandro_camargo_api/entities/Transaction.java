package br.edu.infnet.leandro_camargo_api.entities;

import java.time.LocalDateTime;
import org.springframework.cglib.core.Local;

public abstract class Transaction {
  private Long id;
  private double amount;
  private String description;
  private LocalDateTime timestamp;

  public Transaction(double amount, String description, LocalDateTime timestamp) {
    this.amount = amount;
    this.description = description;
    this.timestamp = timestamp;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }
}
