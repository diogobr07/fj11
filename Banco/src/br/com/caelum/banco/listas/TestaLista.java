package br.com.caelum.banco.listas;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.banco.modelo.ContaCorrente;

public class TestaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> chefes = new ArrayList<>();
		chefes.add("Paulo");
		chefes.add("Guilherme");
		chefes.add("Sérgio");
		chefes.add("Carlos");
		chefes.add("Alberto");
		System.out.println(chefes.toString());
		chefes.remove("Alberto");
		System.out.println(chefes);
		System.out.println(chefes.contains("Paulo"));
		System.out.println(chefes.contains("Ettore"));
		System.out.println(chefes.size());
		System.out.println(chefes.get(2));
	}

}
