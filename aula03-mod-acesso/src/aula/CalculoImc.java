package aula;

import javax.swing.JOptionPane;

public class CalculoImc {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
		pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
		pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")));
		
		JOptionPane.showMessageDialog(null, pessoa.resposta());

	}

}
