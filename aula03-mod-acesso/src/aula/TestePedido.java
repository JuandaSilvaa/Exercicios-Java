package aula;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1234, LocalDate.now(), 100.);
		Pedido pedido2 = new Pedido(311, LocalDate.of(2024, 8, 29), 200.0);
		Pedido pedido3 = new Pedido(311, LocalDate.now(), 200.0);
		
		
		System.out.println(pedido.getNumero());
		System.out.println(pedido2.getTotal());
		System.out.println(pedido3.getNumero());
		
		System.out.println("total geral de pedidos " + Pedido.getCont());
	}

}
