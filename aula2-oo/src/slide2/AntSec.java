package slide2;

import javax.swing.JOptionPane;

public class AntSec {

	public static void main(String[] args) {
		Integer n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº: "));
		
		System.out.println("Numero antecessor: " + (n - 1));
		System.out.println("Numero digitado: " + n);
		System.out.println("Numero sucessor: " + (n + 1));
	}

}
