package exercicios;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return """
				Tipo: %s
				ValorOperacao: %.3f
				Livro: %s""".formatted(tipo,valorOperacao,livro);
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public void emprestarLivros() {
		valorOperacao = livro.getValor() * 0.02 + TAXAEMPRESTIMO;

	}

	@Override
	public void venderLivros() {
		valorOperacao = livro.getValor() * 1.09;
	}

}
