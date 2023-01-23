package ProjetoPrintf;

import java.util.Scanner;

public class ProjetoPrintf {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 	// Imprimindo uma tabuada
	        int i, n;

	        System.out.printf("Informe o número para a tabuada:\n");
	        n = ler.nextInt();

	        System.out.printf("\n+--Resultado--+\n");
	        for (i=1; i<=10; i++) {
	          System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
	        }
	        System.out.printf("+-------------+\n");
	        
	        
	        // Imprimindo Meses de um ano
	        String nomeMes[] = {"Janeiro", "Fevereiro", "Março","Abril", "Maio", "Junho", "Julho", "Agosto","Setembro", "Outubro", "Novembro", "Dezembro"};

	        System.out.println("================");
	        System.out.println("Mês- Nome do Mês");
	        System.out.println("================");
	        for (int ind1 = 0; ind1 < 12; ind1++) {
	          System.out.printf(" %0,2d- %s\n", (ind1+1), nomeMes[ind1]);
	        }
	        System.out.println("================");
	        
	        
	        // listando o conteúdo de um vetor de números 
	        
	        int v[] = {3, 7, 8, 20, 11, 0, 9, 43, 6, 5};

	        for (int ind2 = 0; ind2 < v.length; ind2++) {
	          System.out.printf("v[%d] = %2d\n", ind2, v[ind2]);
	        }
	        
	        // listando números formatados
	        int a = 1, b = 10, c = 100;
	        System.out.printf("'a' = %3d\n'b' = %3d\n'c' = %3d\n", a, b, c);
	        
	        double num1 = 135.4528;
	        double num2 = 23050.568;
	        double num3 = 5.0;
	        System.out.printf("Variavel 'Num1' = %8.2f\n", num1);
	        System.out.printf("Variável 'Num2' = %8.2f\n", num2);
	        System.out.printf("Variável 'Num3' = %8.2f\n", num3);

	}

}
