package slide3;

public class Produto {
	private String descricao;
	private Double valor;
	private int quantidade;

	public Produto(String descricao, Double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;

	}

	public String getDescricao() {
		return descricao;
	}



	public Double getValor() {
		return valor;
	}



	public int getQuantidade() {
		return quantidade;
	}

	
	
	public Double calcularTotal() {
		return valor * quantidade;
	}

	public Double calcularIcms() {
		return (calcularTotal()) * 0.12;
	}

}
