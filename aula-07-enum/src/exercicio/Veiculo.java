package exercicio;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConcerto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConcerto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConcerto = dataConcerto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo modelo: " + modelo + ", valorCobrado: " + valorCobrado + ", dataConcerto: " + dataConcerto
				+ ", proprietario: " + proprietario ;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

}
