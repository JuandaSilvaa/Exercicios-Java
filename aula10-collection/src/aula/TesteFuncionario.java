package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteFuncionario {

	public static void main(String[] args) {
		List<Funcionario> funcionario = Arrays.asList(new Funcionario("Ana", 35), new Funcionario("Igor", 18),
				new Funcionario("Carlos", 33));
		
		Collections.sort(funcionario);
		
		for (Funcionario f : funcionario) {
			System.out.println(f);
		}

	}

}
