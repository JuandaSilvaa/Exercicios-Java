package exercicio1;

public class Aluno {
	private String nome;
	private Double nota1;
	private Double nota2;

	public Aluno(String nome, Double nota1, Double nota2) throws AlunoException {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		if (nota1 < 0 || nota2 < 0) {
			throw new AlunoException("Nota menor que 0");
		} else if (nota1 > 10 || nota2 > 10) {
			throw new AlunoException("Nota maior que 10");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public Double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

}
