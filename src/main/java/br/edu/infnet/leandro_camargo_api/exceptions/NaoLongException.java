package br.edu.infnet.leandro_camargo_api.exceptions;

public class NaoLongException extends RuntimeException {
  public NaoLongException(String mensagem) {
    super(mensagem);
  }
}
