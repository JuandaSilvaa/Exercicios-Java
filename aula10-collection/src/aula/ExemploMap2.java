package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> mapas = new HashMap<>();
		
		mapas.put(100, "ana");
		mapas.put(23, "Carlos");
		mapas.put(34, "Igor");
		mapas.put(35, "Igors");
		mapas.put(45, "Adriana");
		
		System.out.println(mapas);
		
		System.out.println("---------------------------------");
		
		for (Map.Entry<Integer, String> dados : mapas.entrySet()) {
			System.out.println(dados.getKey() + "-" + dados.getValue());
		}
		
	}
}
