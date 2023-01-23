package ProjetoMessageDialog;

import javax.swing.JOptionPane;

public class ProjetoMessageDialog {

	public static void main(String[] args) {
		String nomePessoa   = JOptionPane.showInputDialog("Informe o seu nome");
        int idadePessoa     = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua Idade \n Não minta !!"));
        float salarioPessoa = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu salário"));
        int retorno         = JOptionPane.showConfirmDialog(null, "Prossegue?"," AVISO ",JOptionPane.YES_NO_OPTION );
        if (retorno == 0) {
            JOptionPane.showMessageDialog(null, "Nome :   " + nomePessoa + "\n" +
                                                "Idade:   " + idadePessoa + "\n" + 
                                                "Salário: " + salarioPessoa);
            JOptionPane.showMessageDialog(null, 
                                          "Nome :   " + nomePessoa + "\n" +
                                          "Idade:   " + idadePessoa + "\n" + 
                                          "Salário: " + salarioPessoa ,  
                                          "ATENÇÃO !!", 
                                          JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null, 
                                          "Nome :   " + nomePessoa + "\n" +
                                          "Idade:   " + idadePessoa + "\n" + 
                                          "Salário: " + salarioPessoa ,  
                                          "ATENÇÃO !!", 
                                          JOptionPane.ERROR_MESSAGE);
            
            JOptionPane.showMessageDialog(null, 
                                          "Nome :   " + nomePessoa + "\n" +
                                          "Idade:   " + idadePessoa + "\n" + 
                                          "Salário: " + salarioPessoa ,  
                                          "ATENÇÃO !!", 
                                          JOptionPane.QUESTION_MESSAGE);
            
            JOptionPane.showMessageDialog(null, 
                                          "Nome :   " + nomePessoa + "\n" +
                                          "Idade:   " + idadePessoa + "\n" + 
                                          "Salário: " + salarioPessoa ,  
                                          "ATENÇÃO !!", 
                                          JOptionPane.WARNING_MESSAGE);
	} else if (retorno == 1) {
            System.out.println("Vc quis me enganar");
        } else {
            System.out.println("Programa finalizado com CANCEL");
        }
    }

}
