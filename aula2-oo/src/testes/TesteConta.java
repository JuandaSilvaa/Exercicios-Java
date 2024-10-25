package testes;

import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 134;
		conta1.titular = "Juan";
		conta1.saldo = 1000.0;
		
		conta1.deposito(500.);
		
		if (conta1.saque(200.)) {
			System.out.println("saque efetuado com sucesso");
		} else {
			System.out.println("saque efetuado com sucesso");
		}
		
		System.out.println(conta1.saldo);
	}

}
