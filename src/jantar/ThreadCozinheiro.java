package jantar;

public class ThreadCozinheiro implements Runnable {

	private Caldeirao caldeirao;
	private Selvagem selvagem;

	public ThreadCozinheiro(Caldeirao caldeirao, Selvagem selvagem) {
		this.caldeirao = caldeirao;
		this.selvagem = selvagem;
	}

	@Override
	public void run() {
		System.out.println(caldeirao.porcoes);
		
		synchronized (this) {

			if (!caldeirao.TemSopa()) {
				try {
					wait();
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
				return;
			} else {
				selvagem.Servir(caldeirao);
			}	
		}
	}

}
