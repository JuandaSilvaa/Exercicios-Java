package testes;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com nome:");
		String nome = sc.next();
		System.out.println("Boa noite: " + nome);
		
		
		System.out.println("Idade:");
		Integer idade = sc.nextInt();
		
		System.out.println("Salario: ");
		Double salario = sc.nextDouble();
		
		System.out.printf("%s tem %d anos e salario de %.2f", nome, idade, salario);
		
		sc.close();
		
		
	}

}
