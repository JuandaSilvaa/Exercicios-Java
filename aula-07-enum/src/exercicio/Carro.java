package exercicio;

import java.time.LocalDate;

public class Carro extends Veiculo {

	private String categorias;



	public Carro(String modelo, LocalDate dataConcerto, Proprietario proprietario,
			String categorias) {
		super(modelo, dataConcerto, proprietario);
		this.categorias = categorias;
	}

	public String getCategorias() {
		return categorias;
	}

	@Override
	public double lavarCarro() {

		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocaOleo() {
		if (dataConcerto.getDayOfWeek().getValue() == 6) {
			System.out.println("O concerto será em um sábado! Você ganhou um desconto de 50,00 pila.");
			return valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
		} else {
			return valorCobrado += TipoServico.OLEO.getValorPorServico();
		}
	}

	@Override
	public double revisao() {
		if (dataConcerto.getMonthValue() == 8) {
			System.out.println("O concerto será em agosto! Você ganhou um desconto de 10%");
			return valorCobrado += TipoServico.REVISAO.getValorPorServico() - 20;
		} else {
			return valorCobrado += TipoServico.REVISAO.getValorPorServico();
		}
	}

}
