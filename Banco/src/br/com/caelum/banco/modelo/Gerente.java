package br.com.caelum.banco.modelo;
public class Gerente extends Funcionario {
	
	private int senha = 12345;

	public Gerente (String nome) {
		super(nome);	
	}

	public boolean testaSenha (int senha) {
		return this.senha == senha;
	}
	
	public void setSenha (int senha, int oldSenha) {
		this.senha = testaSenha (oldSenha) ? this.senha = senha : this.senha;	
	}

	public double getBonificacao () {
		return super.getSalario() * 0.1 + 1000;	
	}
}
