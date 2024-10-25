package enumeradores;

//Classe imutavelc"final" - não pode ter filhos
public class Escola {
	private String cnpj;
	private String razaoSocial;

	public Escola(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	//Não pode ser sobrescrito
	public final void gerarRelatorio() {
		System.out.println("Relatório!");
	}
	
}
