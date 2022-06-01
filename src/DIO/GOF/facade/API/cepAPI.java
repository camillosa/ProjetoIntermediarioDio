package DIO.GOF.facade.API;

import subsistema2.cep.cepAPI;

public class cepAPI {
private static cepAPI instancia = new cepAPI();
	
	private cepAPI(){
		super();
	}
	
	public static cepAPI getinstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araquarara";
	}
	
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}
