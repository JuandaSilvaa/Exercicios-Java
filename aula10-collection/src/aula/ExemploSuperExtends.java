package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(10, 20, 40, 9, 50);
		List<String> listaString = Arrays.asList("Sansung", "Apple", "LG");
		List<Object> listaObjetos = new ArrayList<>();

		// imprimirListas(listaNumeros);
		// imprimirListas(listaString);
		copiarLista(listaNumeros, listaObjetos);
		imprimirListas(listaObjetos);

	}
	public static void imprimirListas(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static void copiarLista(List<? extends Number> origem, List<? super Number> destino) {
		for (Number numero : origem) {
			destino.add(numero);
		}
	}

}
