package ProjetoPolimorfismo;

public class ProjetoPolimorfismo {

	public static void main(String[] args) {
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de leite de um Elefante : " + mamifero1.CotaDiariaLeite() + " Kg");

		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária de leite de um Rato.....: " + mamifero2.CotaDiariaLeite() + " Kg");

	}

}
