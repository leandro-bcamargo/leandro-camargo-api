package br.edu.infnet.leandro_camargo_api;

import br.edu.infnet.leandro_camargo_api.entities.Despesa;
import br.edu.infnet.leandro_camargo_api.entities.Receita;
import br.edu.infnet.leandro_camargo_api.services.GerenciadorFinancas;
import br.edu.infnet.leandro_camargo_api.ui.MenuPrincipal;
import br.edu.infnet.leandro_camargo_api.validation.ValidadorDespesa;
import br.edu.infnet.leandro_camargo_api.validation.ValidadorInput;
import br.edu.infnet.leandro_camargo_api.validation.ValidadorReceita;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LeandroCamargoApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(LeandroCamargoApiApplication.class, args); // armazenando o
		// contexto da aplicação para poder encerrá-la em uma das opções do menu
		GerenciadorFinancas gerenciador = new GerenciadorFinancas();
		try (Scanner kb = new Scanner(System.in)) {
			while (true) {
				// TODO: Imprimir última linha do menu só em alguns casos
				MenuPrincipal.imprimeMenuPrincipal();
				int opcao = ValidadorInput.validaInputInt(kb, "");
				switch(opcao) {
					case 1:
            double quantiaDespesa = ValidadorDespesa.validaQuantiaDespesa(kb, "Digite a quantia da "
                + "despesa:");
            String destinacao = ValidadorDespesa.validaDestinacao(kb, "Digite a destinacao da "
              + "despesa:");
            Despesa despesa = new Despesa(quantiaDespesa, destinacao);
            gerenciador.adicionarDespesa(despesa);
            System.out.println("## DESPESA ADICIONADA COM SUCESSO! ##");
						break;
          case 2:
            double quantiaReceita = ValidadorReceita.validaQuantiaReceita(kb, "Digite a quantia da "
                + "receita:");;
            String fonte = ValidadorReceita.validaFonteReceita(kb, "Digite a fonte da receita:");
            Receita receita = new Receita(quantiaReceita, fonte);
            gerenciador.adicionarReceita(receita);
            System.out.println("## RECEITA ADICIONADA COM SUCESSO! ##");
          break;
					case 3:
						double saldo = gerenciador.getSaldo();
						System.out.printf("Seu saldo é R$%.2f.%n", saldo);
						break;
					case 4:
						gerenciador.imprimeExtrato();
						break;
					case 0:
						System.out.println("Encerrando...");
						context.close(); // encerra aplicação
						return;
					default:
						System.out.println("## OPCAO INVALIDA - FAVOR DIGITAR UMA OPCAO DISPONIVEL NO MENU. "
								+ "##");
						break;
				}
			}
		}
	}
}
