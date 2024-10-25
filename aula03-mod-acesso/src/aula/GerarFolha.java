package aula;

import javax.swing.JOptionPane;
 
public class GerarFolha {

	public static void main(String[] args) {
	
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome: ")); 
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario: ")));
		
			JOptionPane.showMessageDialog(null,"nome " + funcionario.getNome() + " Sal. Liq.: " + funcionario.calcularFolha());
			JOptionPane.showMessageDialog(null, "Folha gerada com sucesso");
		  

	}

}
