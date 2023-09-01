import java.util.Scanner;

public class DadosCliente {

	private String nomeCliente;
	private String agencia;
	private int numeroConta;
	private double saldo;

	public DadosCliente(String nomeCliente, String agencia, int numeroConta, double saldo) {

		this.setNomeCliente(nomeCliente);
		this.setAgencia(agencia);
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
