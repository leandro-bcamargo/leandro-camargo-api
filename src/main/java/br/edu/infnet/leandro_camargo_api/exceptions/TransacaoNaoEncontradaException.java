package br.edu.infnet.leandro_camargo_api.exceptions;

public class TransacaoNaoEncontradaException extends RuntimeException {

  public TransacaoNaoEncontradaException(String message) {
    super(message);
  }
}
