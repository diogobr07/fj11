package br.com.caelum.banco.listas;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args){
		Map<String, String> dicionario = new HashMap<String, String>();
		dicionario.put("Table", "Mesa");
		dicionario.put("Dog", "Cacharro");
		dicionario.put("Book", "Livro");
		System.out.println(dicionario.get("Book"));
		System.out.println(dicionario.get("Livro"));
		
	}
}
