package br.edu.infnet.leandro_camargo_api.validation;

import br.edu.infnet.leandro_camargo_api.entities.Transacao;
import br.edu.infnet.leandro_camargo_api.exceptions.TransacaoNaoEncontradaException;
import br.edu.infnet.leandro_camargo_api.services.GerenciadorFinancas;
import java.util.Scanner;

public class ValidadorTransacao {
  public static Transacao validaTransacaoEncontrada(Scanner kb, GerenciadorFinancas gerenciador,
      String mensagem) {
    while (true) {
      System.out.println(mensagem);
      try {
        Long id = ValidadorInput.validaInputLong(kb);
        return gerenciador.getTransacoes().stream().filter(tr -> tr.getId().equals(id)).findFirst().orElseThrow(() ->
            new TransacaoNaoEncontradaException(String.format("## ERRO AO EXCLUIR TRANSAÇÃO: "
                    + "TRANSAÇÃO COM ID %d NÃO ENCONTRADA."
                , id)));
      } catch (RuntimeException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
