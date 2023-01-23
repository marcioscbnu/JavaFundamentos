package ProjetoEncapsulamento;

public class Pessoa {
	private String nomePessoa;
	private int    idadePessoa;
	
	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + getNomePessoa() + ", idadePessoa=" + getIdadePessoa() + "]";
	}

	String getNomePessoa() {
		return nomePessoa;
	}

	void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	int getIdadePessoa() {
		return idadePessoa;
	}

	void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
	
	
}
