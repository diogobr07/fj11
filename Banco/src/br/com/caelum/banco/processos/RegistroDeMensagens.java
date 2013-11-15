package br.com.caelum.banco.processos;

import java.util.Collection;
import java.util.Vector;

public class RegistroDeMensagens {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new Vector<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		//faz com que thread que o roda o main aguarde o fim dessa
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagenes finalizadas");
		
		//verifica se alguma mensagem ficou nula
		if (mensagens.contains(null)) {
			throw new IllegalStateException("não devia ter nul aqui dentro!");
		}
		System.out.println("Fim da execucao com sucesso");

	}

}
