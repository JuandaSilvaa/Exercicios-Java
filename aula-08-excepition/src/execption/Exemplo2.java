package execption;

import java.io.FileNotFoundException;

public class Exemplo2 {

	public static void main(String[] args) {
		int vetor[] = {5,10,20};
		int i=10 , j=0, resultado=0;
		String texto = null;
		
		try {
			resultado = i / j;
			System.out.println(vetor[1]);
			System.out.println(texto.toUpperCase());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro indice fora de faixa");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Divisão por 0");
		} catch (NullPointerException e) {
			System.err.println("Valores nulos!");
		}

	}

}
