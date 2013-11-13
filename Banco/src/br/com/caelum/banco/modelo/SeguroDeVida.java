package br.com.caelum.banco.modelo;

import br.com.caelum.banco.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calculaTributos() {
		return 42;
	}

}
