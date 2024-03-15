package jantar;

public class ThreadSelvagem implements Runnable {

	private Caldeirao caldeirao;
	private Selvagem selvagem;
	private String nome;
	private Cozinheiro tC;

	public ThreadSelvagem(Caldeirao caldeirao, Selvagem selvagem, String nome, Cozinheiro tC) {
		this.caldeirao = caldeirao;
		this.selvagem = selvagem;
		this.nome = nome;
		this.tC = tC;
	}

	@Override
	public synchronized void run() {
		selvagem.Servir(caldeirao, nome, tC);
	}

}
