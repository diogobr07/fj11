package br.com.caelum.banco.listas;

import java.util.HashSet;
import java.util.Set;

public class TesaConjunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> cj = new HashSet<String>();
		cj.add("Cobol");
		cj.add("C#");
		cj.add("Pascal");
		cj.add("Ruby");
		cj.add("Fortran");
		cj.add("Cobol");
		System.out.println(cj.add("Ruby"));
		System.out.println(cj);

	}

}
