package jantar;

public class Main {
	public static void main(String[] args) {
		int maxPorcoes = 10;
		Caldeirao caldeirao = new Caldeirao(maxPorcoes);
		Selvagem selvagem = new Selvagem();
		Cozinheiro cozinheiro = new Cozinheiro();
		
		Thread TC = new Thread(new ThreadCozinheiro(caldeirao, cozinheiro));
		TC.start();
		for (int i = 0; i < 15; i++) {
			Thread TS = new Thread(new ThreadSelvagem(caldeirao, selvagem, "Selvagem " + i, cozinheiro));
			TS.start();
		}
	}
}
