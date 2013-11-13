package br.com.caelum.banco.modelo;

import br.com.caelum.banco.exception.ValorInvalidoException;
/**
 * 
 * @author diogo
 *
 */
public abstract class Conta {

	private int numero;
	private String titular;
	protected double saldo;
	private double limite;

	public Conta() {
		limite = 1000;
	}

	public Conta(String titular) {
		this.titular = titular;
	}

	public void mostra() {
		System.out.println("numero " + numero);
		System.out.println("titular " + titular);
		System.out.println("saldo " + saldo);
		System.out.println("limite " + limite);
	}
	
	/**
	 * 
	 * @param valor valor a ser depositado
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		saldo += valor;
	}

	/**
	 * 
	 * @param valor retorna se você conseguiu realizar o saque
	 * @return
	 */
	public boolean saca(double valor) {
		if (valor < saldo + limite) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param destino conta de destino
	 * @param valor valor a ser transferido para a conta destino
	 */
	public void transferePara(Conta destino, double valor) {
		if (saca(valor)) {
			destino.deposita(valor);
		}
	}

	public abstract void atualiza(double taxa);

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}
	
	@Override
	public String toString() {
		return "eu sou uma Conta";
	}
}
