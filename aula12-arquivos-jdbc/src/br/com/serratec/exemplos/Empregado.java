package br.com.serratec.exemplos;

public class Empregado {
	private String nome;
	private String profisao;

	public Empregado(String nome, String profisao) {
		this.nome = nome;
		this.profisao = profisao;
	}

	@Override
	public String toString() {
		return "nome: " + nome + " profisao: " + profisao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfisao() {
		return profisao;
	}

	public void setProfisao(String profisao) {
		this.profisao = profisao;
	}

}
