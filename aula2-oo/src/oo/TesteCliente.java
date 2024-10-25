package oo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();
		
		
		
		Cliente c = new Cliente();
		c.nome = "Maria";
		c.cpf = "123";
		c.telefone = "22334455";
		
		c2.nome = "Maria";
		c3.nome = "Joaquim";
		c4.nome = "Joaquim";
		
		
		if (c==c2) {
			
		}
		
		System.out.println(c.nome);
		
	}

}
