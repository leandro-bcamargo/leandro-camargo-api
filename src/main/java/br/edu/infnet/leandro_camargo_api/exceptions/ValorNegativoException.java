package br.edu.infnet.leandro_camargo_api.exceptions;

public class ValorNegativoException extends RuntimeException {
  public ValorNegativoException(String message) {
    super(message);
  }
}
