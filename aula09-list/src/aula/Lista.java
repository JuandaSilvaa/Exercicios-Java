package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos"); 
		nomes.add("Juan");
		nomes.add("Gabriela");
		
		
		if (nomes.contains("Juan")) {
			System.out.println(nomes.indexOf("Juan"));
			nomes.remove(nomes.indexOf("Juan"));
		}
		
		System.out.println(nomes);
		
		for (Object object : nomes) {
			System.out.println(object);
		}
	}

}
