package slide3;

public class Calculadora {

	private Double n1, n2;

	public Calculadora(Double n1, Double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public Double soma() {
		return n1 + n2;
	}

	public Double subtracao() {
		return n1 - n2;
	}

	public Double multiplicação() {
		return n1 + n2;
	}

	public Double divisão() {
		return n1 / n2;
	}
}
