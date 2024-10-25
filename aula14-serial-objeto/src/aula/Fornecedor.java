package aula;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author juan
 * @since classe criada em setembro de 2024
 * 
 */


public class Fornecedor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * o cnpj e o identificador de uma empresa
	 */
	private String cnpj;
	private String nome;
	
	/**
	 * 
	 * @author juan
	 * @param valor double - valor do pagamento
	 * @return o valor pago.
	 * @throws IllegalArgumentException caso tenha um valor inválido.
	 * 
	 */
	public Double pagamentofornecedor(Double valor) {
		return 0.0;
	}

	public Fornecedor(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "cnpj: " + cnpj + "\nnome: " + nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(nome, other.nome);
	}

}
