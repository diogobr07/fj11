package br.com.caelum.banco.modelo;
public class ContaSalario extends Conta {
	
	public ContaSalario() {
		
	}

	public ContaSalario(String titular) {
		super(titular);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}
