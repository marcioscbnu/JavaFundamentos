package ProjetoCondicional;

public class ProjetoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal - Número 1 é menor que Número 2");
		}
		
		if (num1 > num2) {
			System.out.println("if com else - Número 1 é maior que Número 2");			
		} else {
			System.out.println("if com else - Número 1 é menor que Número 2");
		}
		
		// Condição composta - situação num1 < num2
		if (num1 > num2) {
			System.out.println("Condição composta 1 - Número 1 é maior que Número 2");	
		} else if (num1 < num2) {
			System.out.println("Condição composta 1 - Número 1 é menor que Número 2");	
		} else {
			System.out.println("Condição composta 1 - Número 1 é igual ao Número 2");
		}

		// Condição composta - situação num1 = num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condição composta 2 - Número 1 é maior que Número 2");	
		} else if (num1 < num2) {
			System.out.println("Condição composta 2 - Número 1 é menor que Número 2");	
		} else {
			System.out.println("Condição composta 2 - Número 1 é igual ao Número 2");
		}

		// comando condicional SWITCH

		char opcao = '4';

		switch (opcao) {
			case '1': {
				System.out.println("Chame programa de Inclusão");
				break;
			}
			case '2': {
				System.out.println("Chame programa de Alteração");
				break;
			}
			case '3': {
				System.out.println("Chame programa de Exclusão");
				break;
			}
			case '4': {
				System.out.println("Chame programa de Consulta");
				break;
			}
		}

	}

}
