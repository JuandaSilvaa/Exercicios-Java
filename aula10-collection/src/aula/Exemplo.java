package aula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Branco");
		lista.add("Preto");
		lista.add("amarelo");
		lista.add("Azul");
		Collections.sort(lista);
		System.out.println(lista);
		
		//não duplica e a ordem e aleatoria 
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		System.out.println(numeros);
		
		//onde que chegaram
		Set<Integer> numeros1 = new LinkedHashSet();
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		System.out.println(numeros1);

		// ordem ordenada
		Set<Integer> numeros2 = new TreeSet<>();
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		System.out.println(numeros2);
		
		
		
	}

}
