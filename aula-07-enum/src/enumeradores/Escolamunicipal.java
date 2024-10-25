package enumeradores;

public class Escolamunicipal extends Escola {
	private final String SEGMENTO;

	public Escolamunicipal(String cnpj, String razaoSocial, String sEGMENTO) {
		super(cnpj, razaoSocial);
		this.SEGMENTO = sEGMENTO;

	}

	public String getSEGMENTO() {
		return SEGMENTO;
	}

	public static void main(String[] args) {
		Escolamunicipal em = new Escolamunicipal("123", "Liceu", "Fundamental");
	}

}
