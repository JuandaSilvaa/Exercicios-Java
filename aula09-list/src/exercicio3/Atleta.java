package exercicio3;

public class Atleta {
	private String nome;
	private int Idade;
	private String posicao;

	public Atleta(String nome) {
		super();
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return "nome=" + nome;
	}


	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return Idade;
	}

	public String getPosicao() {
		return posicao;
	}

}
