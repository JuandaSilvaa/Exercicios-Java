package slide3;

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) {

		int digito, resposta;

		do {

			Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
			Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

			Calculadora calculadora = new Calculadora(n1, n2);

			digito = Integer
					.parseInt(JOptionPane.showInputDialog(null, "(1)soma(2)subtracao(3)multiplicação(4)divisão"));

			switch (digito) {
			case 1:
				JOptionPane.showMessageDialog(null, calculadora.soma());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, calculadora.subtracao());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, calculadora.multiplicação());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, calculadora.divisão());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;

			}

			resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Continuar",
					JOptionPane.YES_NO_OPTION);

		} while (resposta == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "Programa encerrado.");
	}

}
