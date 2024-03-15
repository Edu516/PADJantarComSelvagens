package jantar;

public class Selvagem {
	
	private boolean servido = false;
	
	public synchronized void Servir(Caldeirao c, String nome, Cozinheiro tC) {   
	    // não tem sopa
	    if (!c.TemSopa()) {
	    	synchronized(tC) {
	    		tC.notifyAll();
	    	}
	        try {
	            System.out.println("não tem sopa");
	            wait();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        return;
	    }
	    
	    // se servindo
	    System.out.println(nome + " Servido");
	    servido = true;
	    c.diminuirPorcao();
	    Comer(nome);
	}


	public void Comer(String nome) {			
		System.out.println(nome + " Comeu a sopa");
		servido = false;
	}
}
