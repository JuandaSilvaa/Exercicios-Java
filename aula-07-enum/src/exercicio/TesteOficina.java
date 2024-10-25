package exercicio;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Juan");
		Carro c1 = new Carro("Onix", LocalDate.of(2024, 9, 7), p1, "Heatch");
		
		c1.trocaOleo();
		c1.revisao();
		
		System.out.println(c1.toString());

	}

}
