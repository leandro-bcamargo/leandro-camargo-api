package br.edu.infnet.leandro_camargo_api.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatador {
  public static String formatarDataHora(LocalDateTime dataHora) {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    return dataHora.format(formatador);
  }
}
