package exercicio2;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private static int totalParticipante = 0;
	private Pais pais;

	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;

	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static int getTotalParticipante() {
		return totalParticipante;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String verificaSituacao() {
		if (this.getPeso() > 90) {
			setModalidade("Peso pesado");
			totalParticipante++;
			return "Participará";
		} else if (this.getPeso() >= 60 && this.getPeso() <= 90) {
			setModalidade("Peso médio");
			totalParticipante++;
			return "Participará";
		} else {
			return "Não participará";
		}
	}
}
