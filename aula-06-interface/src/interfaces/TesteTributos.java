package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", 98000.);
		Empresa e = new Empresa("ABC Ltda", 288500.);
		TotalTributos t = new TotalTributos();
		t.totalizarTributos(p);
		t.totalizarTributos(e);
		
		System.out.println("IR: " + p.getNome() +"-"+ p.calcularIR());
		System.out.println("ICMS: " + p.getNome() +"-"+ p.calcularICMS());
		
		System.out.println("\nIR: " + e.getRazaoSocial() +"-"+ e.calcularIR());
		System.out.println("ICMS: " + e.getRazaoSocial() +"-"+ e.calcularICMS());
		
		System.out.println("\nTotalGeral: " + t.getTotalGeral());
		

		
	}

}
