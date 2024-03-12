package jantar;

public class Main {
	public static void main(String[] args) {
		int maxPorcoes = 10;
		Caldeirao caldeirao = new Caldeirao(maxPorcoes);
		Selvagem selvagem = new Selvagem();
		
		for (int i = 0; i < 15; i++) {
			Thread TS1 = new Thread(new ThreadCozinheiro(caldeirao, selvagem));
			TS1.start();
		}
	}

}
