package aula;

public class Funcionario {

	enum EstadoCivil {
		CASADO('C'), SOLTEIRO('S'), VIUVO('V'), DIVORCIADO('D');

		private char valor;

		EstadoCivil(char valor) {
			this.valor = valor;
		}

	}

	private String nome;
	private EstadoCivil estadoCivil;

	public Funcionario(String nome, EstadoCivil estadoCivil) {
		super();
		this.nome = nome;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
