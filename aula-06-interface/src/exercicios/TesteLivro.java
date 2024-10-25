package exercicios;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.00);
		Livro l2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.00);
		
		
		
		Operacao o1 = new Operacao("venda", l1);
		Operacao o2 = new Operacao("empréstimo", l2);
		
		l1.reajuste(l1.getValor());
		o1.venderLivros();
		o2.emprestarLivros();
		
		System.out.println(o1);
		System.out.println(o2);
		
		
	}

}
