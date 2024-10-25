package slide2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		Integer numero = sc.nextInt();
		
		System.out.println("+----Resultado----+");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("| %2d  *  %2d = %3d |\n", numero, i, numero * i);
		}
		
		System.out.println("+-----------------+");
		
		sc.close();
	}

}
