package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteMarca { 

	public static void main(String[] args) {
		ArrayList<Marca> marcas = new ArrayList();
		List<Marca> marcas2 = Arrays.asList(new Marca(4, "Chevrolet"), 
											new Marca(5, "BMW"));
		
		marcas.add(new Marca(1, "VolksWagn"));
		marcas.add(new Marca(2, "Fiat"));
		marcas.add(new Marca(1, "Nissan"));
		
		marcas.addAll(marcas2);
		
		System.out.println(marcas); 
		
		
	}

}
