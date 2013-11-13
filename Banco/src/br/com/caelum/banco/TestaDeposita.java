package br.com.caelum.banco;

import br.com.caelum.banco.exception.ValorInvalidoException;
import br.com.caelum.banco.modelo.ContaPoupanca;

public class TestaDeposita {
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
