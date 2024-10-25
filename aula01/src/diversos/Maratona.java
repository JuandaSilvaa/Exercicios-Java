package diversos;

import javax.swing.JOptionPane;

public class Maratona {
	public static void main(String[] args) {
		double altura;
		int idade;
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		if (altura >= 1.70 || idade >= 18) {
			System.out.println("Pode participar");
		}else {
			System.out.println("Não pode participar");
		}
		
	}
}