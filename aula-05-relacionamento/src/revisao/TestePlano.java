package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Checkup", "1234567");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a =new Anestesista("Amil", "Carlos", "123", "Geral");
		ControlePgto cp = new ControlePgto();
		
		c.calcularPagamento();
		cp.calcularTotal(c);
		
		m.calcularPagamento();
		cp.calcularTotal(m);
		
		a.calcularPagamento();
		cp.calcularTotal(a);
		
		System.out.println(c);
		System.out.println(m);
		System.out.println(a);
		System.out.println("Total Geral Pago: " + cp.getTotalPago());
		
		System.out.println("Valo total pago: " + (c.getValorPago() + m.getValorPago() + a.getValorPago()));
	}

}
