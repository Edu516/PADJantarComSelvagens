package jantar;

public class Caldeirao {
	public int porcoes;
	private int maxPorcoes;
	
	public Caldeirao(int maxPorcoes) {
		this.maxPorcoes = maxPorcoes;
		encherCaldeirao();
	}

	
	public void encherCaldeirao() {
		porcoes = maxPorcoes;
	}
	
	public void diminuirPorcao() {
		porcoes--;
	}
	
	public boolean TemSopa() {
		if(porcoes == 0)
			return false;
		else 
			return true;
	}
}
