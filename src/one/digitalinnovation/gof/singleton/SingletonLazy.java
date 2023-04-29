public static synchronized SingletonLazy getInstancia() {
	if (instancia == null) {
		instancia = new SingletonLazy();
	}
	return instancia;
}
