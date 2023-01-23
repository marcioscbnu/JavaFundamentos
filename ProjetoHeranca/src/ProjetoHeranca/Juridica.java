package ProjetoHeranca;

public class Juridica extends Pessoa {
	
	private String cnpj ;
	private String inscEstadual;
	
	
	// área de gettters de setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	


	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
}