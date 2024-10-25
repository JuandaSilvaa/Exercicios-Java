package execption;

public class Exemplo {
	
	//throw - lançar
	//throws - encaminhar o tratamento erro para o método camador
	public static double calcular(int a, int b) throws ArithmeticException{
		/*if (b==0) {
			throw new ArithmeticException("Erro de divisão por 0");
		}*/
		return a / b;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Entreando no try");
			System.out.println("Resultado:" + calcular(10, 0));
			System.out.println("Finalizando o try");
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("\"Erro de divisão por 0");
		}finally {
			//finally - sempre é executado
			System.out.println("Sempre é executado");
		}
		
	}
}	
