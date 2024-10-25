package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		Assistente a = new Assistente("Juan", 2200., "Noite", "Nivel-1");
		Diretor d = new Diretor("Anna", 8500., "Integral", "Financeiro");
		
		a.reajustSalario();
		d.reajustSalario();

		System.out.println(a);
		System.out.println(d);
		
	}

}
