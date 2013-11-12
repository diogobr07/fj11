
public class TestaTributavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		ContaCorrente  volta = (ContaCorrente)t;
		System.out.println(volta.getLimite());
		
		Tributavel t2 = new SeguroDeVida();
		System.out.println(t2.calculaTributos());

	}

}
