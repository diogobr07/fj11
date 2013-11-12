public class Personagem {
	private String nome;
	private String avatar;
	private int vida;
	private String[] armas;
	private double dinheiro;

	public Personagem() {
		// TODO Auto-generated constructor stub
	}
	
	public Personagem(String nome, String avatar, int vida, String[] armas, double dinheiro) {
		super();
		this.nome = nome;
		this.avatar = avatar;
		this.vida = vida;
		this.armas = armas;
		this.dinheiro = dinheiro;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String[] getArmas() {
		return armas;
	}

	public void setArmas(String[] armas) {
		this.armas = armas;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
