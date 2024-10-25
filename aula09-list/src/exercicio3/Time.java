package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private List <Atleta> atletas;
	
	public Time(String nomeTime, String tecnico, String diretor) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atletas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Nome do time: " + nomeTime + " tecnico: " + tecnico + " diretor: " + diretor + " atletas: " + atletas + "\n";
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void adicionarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}
		
}
