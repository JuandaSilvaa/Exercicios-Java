package heranca;

public class Gerente extends Empregado {
	private String categoria;
	private Integer numeroEmpregados;
	
	

	@Override
	public String toString() {
		return super.toString() + " Gerente [categoria=" + categoria + ", numeroEmpregados=" + numeroEmpregados + "]";
	}
	

	public void aumentoSalario() {
		salario = salario * 1.15;
	}
	
	

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}
}
