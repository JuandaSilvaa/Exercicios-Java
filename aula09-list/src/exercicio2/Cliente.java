package exercicio2;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private int telefone;

	public Cliente(int id, String nome, int idade, int telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "[ Cliente id: " + id + ", nome: " + nome + ", idade: " + idade + ", telefone: " + telefone + " ] " ;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getTelefone() {
		return telefone;
	}

}
