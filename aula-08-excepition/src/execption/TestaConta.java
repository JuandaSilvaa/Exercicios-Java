package execption;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);

		try {
			cc.deposito(0.);
			cc.saque(200);
			System.out.println(cc);
		} catch (ContaException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}


	}

}
