package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {
		//Polimorfismo - um objeto pode ser referenciado de varias formas
		//Veiculo v1 = new Moto("LVC9090", "Cinza", 39000., true);
		Moto v1 = new Moto("LVC9090", "Cinza", 39000., true);
		Caminhao v2 = new Caminhao("LVC9090", "Cinza", 39000., 1000000);
		
		
		
		System.out.println(v1);
		System.out.println("Valor IPVS: " + v1.calcularIpva());
		System.out.println(v2);
		System.out.println("Valor IPVS: " + v2.calcularIpva());
	}

}
