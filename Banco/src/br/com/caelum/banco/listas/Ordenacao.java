package br.com.caelum.banco.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
	public static void main (String[] args){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Joaquim");
		nomes.add("Xuazenegruer");
		nomes.add("Monel");
		nomes.add("Bruce Willis");
		
		System.out.println(nomes);
		Collections.sort(nomes);
		System.out.println(nomes);
	}
}
