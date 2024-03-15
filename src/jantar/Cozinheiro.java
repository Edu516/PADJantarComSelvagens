package jantar;

public class Cozinheiro {

	public void encher_caldeirao(Caldeirao caldeirao) {
		caldeirao.encherCaldeirao();
	}

	public synchronized void dormir(Caldeirao caldeirao) {
		System.out.println("Dormindo");
		try {
			wait();
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		if (!caldeirao.TemSopa()) {
			System.out.println("Enchendo a Sopa");
			encher_caldeirao(caldeirao);
		}
	}
	
}
