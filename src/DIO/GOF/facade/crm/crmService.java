package DIO.GOF.facade.crm;

public class crmService {
	private crmService(){
		super();
	}
	public static void gravarCliente (String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema CRM");

		System.out.println(estado);
		System.out.println(cidade);
		System.out.println(cep);
		System.out.println(nome);
		
	}
}
