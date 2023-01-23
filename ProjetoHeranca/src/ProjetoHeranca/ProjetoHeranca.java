package ProjetoHeranca;

public class ProjetoHeranca {

	public static void main(String[] args) {
		Fisica fisica = new Fisica();
		fisica.setNomePessoa("João da Silva");
		fisica.setIdadePessoa(51);
		fisica.setCpf("48440396953");
		fisica.setIdentidade("1354618");

		System.out.println("     ******  Pessoa Física ****** "       + "\n" +
				           "Nome........: " + fisica.getNomePessoa()  + "\n" +
				           "Idade.......: " + fisica.getIdadePessoa() + "\n" +
				           "CPF.........: " + fisica.getCpf()         + "\n" +
				           "Identidade..: " + fisica.getIdentidade()  + "\n");
	
		Juridica juridica = new Juridica();
		juridica.setNomePessoa("Companhia da Bagaça");
		juridica.setIdadePessoa(40);
		juridica.setInscEstadual("125.445.587");
		juridica.setCnpj("53.455.565/0001-87");
	
		System.out.println("     ******  Pessoa Jurídica ****** "  + "\n" +
		           "Nome..........: " + juridica.getNomePessoa()   + "\n" +
		           "Anos Empresa..: " + juridica.getIdadePessoa()  + "\n" +
		           "CNPJ..........: " + juridica.getCnpj()         + "\n" +
		           "Inscr.Estadual: " + juridica.getInscEstadual() + "\n");
	}
}
