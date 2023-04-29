package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author
 */
public final class SingletonEager {

	private static final SingletonEager INSTANCIA = new SingletonEager();
	
	private SingletonEager() {
		// previne a instanciação direta da classe
	}
	
	public static SingletonEager getInstancia() {
		return INSTANCIA;
	}
	
	public void metodoExemplo() {
		// método de exemplo
	}
}
