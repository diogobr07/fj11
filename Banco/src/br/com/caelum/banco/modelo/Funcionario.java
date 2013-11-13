package br.com.caelum.banco.modelo;
public abstract class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	public Funcionario () {

	}
	
	public Funcionario (String nome) {
		this.nome = nome;
	}

	public void recebeAumento(double aumento) {
		salario += aumento;
	}

	public double getGanhoAnual(){
		return salario * 12;	
	}

	public abstract double getBonificacao ();

	public void mostra() {
		System.out.println("nome: " + nome);
		System.out.println("departamento: " + departamento);
		System.out.println("salario: " + salario);
		System.out.println("data entrada: " + dataEntrada);
		System.out.println("rg: " + rg);
		System.out.println("Esta na empresa: " + estaNaEmpresa);
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public String getNome () {
		return nome;
	}

	public void setDepartamento (String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento () {
		return departamento;
	}

	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public double getSalario () {
		return salario;
	}

	public void setDataEntrada (String dataEntrada) {
		this.dataEntrada = dataEntrada;	
	}

	public String getDataEntrada () {
		return dataEntrada;
	}

	public void setRg (String rg) {
		this.rg = rg;
	}

	public String getRg () {
		return rg;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public boolean getEstaNaEmprea () {
		return estaNaEmpresa;
	}
}
