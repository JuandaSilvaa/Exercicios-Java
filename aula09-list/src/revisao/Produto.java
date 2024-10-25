package revisao;

public class Produto {
	private String descricao;
	private Double valor;

	public Produto(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

}
