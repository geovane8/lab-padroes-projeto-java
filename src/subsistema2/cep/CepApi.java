private CepApi() {}

public static CepApi getInstancia() {
	return instancia;
}

public String recuperarCidade(String cep) {
	// Aqui poderia ser implementada a lógica para recuperar a cidade com base no CEP
	// Por enquanto, vamos retornar uma cidade fixa
	return "Araraquara";
}

public String recuperarEstado(String cep) {
	// Aqui poderia ser implementada a lógica para recuperar o estado com base no CEP
	// Por enquanto, vamos retornar um estado fixo
	return "SP";
}
