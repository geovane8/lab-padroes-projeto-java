package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 */
public final class SingletonEager {

    private static final SingletonEager INSTANCIA = new SingletonEager();

    private SingletonEager() {
        // previne a instanciação direta da classe
    }

    /**
     * Retorna a instância única deste singleton.
     *
     * @return a instância única deste singleton
     */
    public static SingletonEager getInstancia() {
        return INSTANCIA;
    }

    public void metodoExemplo() {
        // implementation details
    }
}
