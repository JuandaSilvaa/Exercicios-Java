package exercicios;

import java.util.Scanner;

public class CalculadoraMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um N");
		int a = ler.nextInt();
		System.out.println("Informe um N");
		int b = ler.nextInt();
		System.out.println("Informe um N");
		int c = ler.nextInt();
		System.out.println("Informe um N");
		int d = ler.nextInt();
		
		ler.close();
		
		System.out.println((a + b + c + d) / 4);
		
	}
}
