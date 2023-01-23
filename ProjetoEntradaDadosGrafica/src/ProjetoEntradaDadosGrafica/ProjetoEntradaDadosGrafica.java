package ProjetoEntradaDadosGrafica;

import javax.swing.JOptionPane;

public class ProjetoEntradaDadosGrafica {

	public static void main(String[] args) {
int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
//		System.out.println("A pessoa tem " + idade + " anos de idade");
		JOptionPane.showMessageDialog(null,"A pessoa tem " + idade + " anos de idade");
		JOptionPane.showMessageDialog(null, "Teste", "ATENÇÃO !!", 1);
	}
}
