package interfaces;

//Uma interface não pode ser instanciada
//Não tem implementação
//Atributos são final
public interface Conta {
	Double IMPOSTO = 10.00;
	void saque(Double valor);
	void deposito(Double valor);
}
