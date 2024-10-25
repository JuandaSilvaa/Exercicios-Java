package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Roni", "Roni@gmail.com");
		Pessoa p2 = new Pessoa("Adriana", "a@gmail.com");

		Imovel i1 = new Imovel("Casa", 180000., p2);
		Imovel i2 = new Imovel("Casa", 280000., p1);
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
