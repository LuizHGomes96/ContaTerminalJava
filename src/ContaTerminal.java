
/**<h1>Projeto Básico de Conta Bancária</h1>
 * 
 * <p>A conta deve ter 4 característica: Nome (String), Agência(String), Número da Conta(int) e Saldo(double);</p>
 * 
 * <p>Por se tratar de um sistema de conta bancária, resolvi adicionar uma camada a mais de segurança utilizando conceitos de encapsulamento, como Getters e Setters.</p>
 * 
 * @author Luiz Henrique
 * @version 1.0.0
 * @Since 28/08/2023
 * 
 
 * */

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DadosCliente dadosCliente = new DadosCliente(null, null, 0, 0);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao Banco DIO");

		System.out.println("Para iniciar, nos informe seu nome: ");
		dadosCliente.setNomeCliente(scanner.nextLine());

		System.out.println("Agora, nos diga o número da agência: ");
		dadosCliente.setAgencia(scanner.nextLine());

		System.out.println("Agora o número da conta: ");
		dadosCliente.setNumeroConta(scanner.nextInt());

		System.out.println("Por último, qual vai ser o valor do depósito inicial? ");
		dadosCliente.setSaldo(scanner.nextDouble());

		System.out.printf(
				"Olá %s, obrigado por criar conta no nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque",
				dadosCliente.getNomeCliente(), dadosCliente.getAgencia(), dadosCliente.getNumeroConta(),
				dadosCliente.getSaldo());
	}
}
