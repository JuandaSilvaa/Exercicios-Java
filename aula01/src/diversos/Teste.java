package diversos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		String texto = "João";
		System.out.println("Hello world! ");
		System.out.println("Java! " + texto);
		JOptionPane.showConfirmDialog(null, "Hello Word!");
		JOptionPane.showConfirmDialog(null, "Hello Word!");
		JOptionPane.showConfirmDialog(null, "Hello Word!");
		JOptionPane.showConfirmDialog(null, "Hello Word!");
		texto = JOptionPane.showInputDialog("Digite o seu nome");
		JOptionPane.showConfirmDialog(null, texto);
	}
}
