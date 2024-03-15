package jantar;

public class ThreadCozinheiro implements Runnable {
	private Caldeirao caldeirao;
	private Cozinheiro cozinheiro;

	public ThreadCozinheiro(Caldeirao caldeirao, Cozinheiro cozinheiro) {
		this.caldeirao = caldeirao;
		this.cozinheiro = cozinheiro;
	}

	@Override
	public synchronized void run() {
		while(true) {
			cozinheiro.dormir(caldeirao);			
		}
	}

}
