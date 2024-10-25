package interfaces;

public class Empresa implements Tributos {
	private String razaoSocial;
	private Double rendeimentos;

	public Empresa(String razaoSocial, Double rendeimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendeimentos = rendeimentos;
	}

	@Override
	public String toString() {
		return "razaoSocial: " + razaoSocial + ", rendeimentos: " + rendeimentos;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Double getRendeimentos() {
		return rendeimentos;
	}

	public void setRendeimentos(Double rendeimentos) {
		this.rendeimentos = rendeimentos;
	}

	@Override
	public double calcularIR() {
		return rendeimentos * IRPESSOAJURIDICA;
	}

	@Override
	public Double calcularICMS() {
		return rendeimentos * ICMS;
	}

}
