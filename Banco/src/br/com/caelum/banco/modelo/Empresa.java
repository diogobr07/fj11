package br.com.caelum.banco.modelo;
public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;

	void adciona (Funcionario f) {
		for (int i = 0; i < empregados.length; i ++) {
			if (empregados[i] == null) {
				empregados[i] = f;
				break;
			}
		}
	}

	void mostraEmpregados(){
		for(Funcionario f : empregados) {
			if (f == null) break;
			f.mostra();
		}
	}
}
