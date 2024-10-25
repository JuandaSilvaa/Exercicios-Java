package exercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConcerto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, dataConcerto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarCarro() {
		return valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocaOleo() {
		return valorCobrado = TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return valorCobrado = TipoServico.REVISAO.getValorPorServico();
	}

}
