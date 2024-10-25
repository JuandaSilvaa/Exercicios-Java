package banco;

public class Conta {
	public Integer numero;
	public String titular;
	public Double saldo;

	// void - sem retorno
	public void deposito(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido");
		} else {
			saldo += valor;
			System.out.println("Deposito efetuado!!");
		}
	}

	// metodo com retorno boolean
	public boolean saque(Double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}

}
