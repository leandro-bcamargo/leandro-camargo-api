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
		GerenciadorFinancas gf = new GerenciadorFinancas();
		try (Scanner kb = new Scanner(System.in)) {
			while (true) {
				// TODO: Imprimir última linha do menu só em alguns casos
				MenuPrincipal.imprimeMenuPrincipal();
				int opcao = ValidadorInput.validaInputInt(kb, "");
				switch(opcao) {
					case 1:
						try {
							double quantiaDespesa = ValidadorInput.validaInputDouble(kb,"Digite a quantia da "
									+ "despesa:");
							ValidadorDespesa.validaQuantiaDespesa(quantiaDespesa);
							System.out.println("Digite a destinacao da despesa:");
							String destinacao = kb.nextLine();
							ValidadorDespesa.validaDestinacao(destinacao);
							Despesa despesa = new Despesa(quantiaDespesa, destinacao);
							gf.adicionarDespesa(despesa);
							System.out.println("Despesa adicionada com sucesso!");
						} catch(Exception e) {
							System.out.println("## ERRO AO TENTAR INSERIR DESPESA: " + e.getMessage() + " ##");
						}
						break;
					case 2:
						try {
							double quantiaReceita = ValidadorInput.validaInputDouble(kb, "Digite a quantia da "
									+ "receita:");
							ValidadorReceita.validaQuantiaReceita(quantiaReceita);
							System.out.println("Digite a fonte da receita:");
							String fonte = kb.nextLine();
							ValidadorReceita.validaFonteReceita(fonte);
							Receita receita = new Receita(quantiaReceita, fonte);
							gf.adicionarReceita(receita);
							System.out.println("Receita adicionada com sucesso!");
						} catch(Exception e) {
							System.out.println("## ERRO AO TENTAR INSERIR RECEITA: " + e.getMessage() + " ##");
						}
						break;
					case 3:
						double saldo = gf.getSaldo();
						System.out.printf("Seu saldo é R$%.2f.%n", saldo);
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
