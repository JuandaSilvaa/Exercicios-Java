package slide2;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		String nome, email, telefone;
		Double salario = 0.0, salarioComAcrescimo;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		email = JOptionPane.showInputDialog("Digite o seu email");
		telefone = JOptionPane.showInputDialog("Digite o seu telefone");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		
		salarioComAcrescimo = salario * 1.10;
		
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Salário original: R$" + salario);
        System.out.println("Salário com acréscimo de 10%: R$" + salarioComAcrescimo);
	}

}
