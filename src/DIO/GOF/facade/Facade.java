package DIO.GOF.facade;

import DIO.GOF.facade.API.cepAPI;
import DIO.GOF.facade.crm.crmService;

public class Facade {

	public void migrarCliente (String nome, String cep) {
		String cidade = cepAPI.getinstancia().recuperarCidade(cep);
		String estado = cepAPI.getinstancia().recuperarEstado(cep);			
		
		crmService.gravarCliente(nome, cep, cidade, estado);
	}
}
