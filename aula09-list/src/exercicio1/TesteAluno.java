package exercicio1;

import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		
		try {
			List<Aluno> alunos = List.of(new Aluno("Juan", 11., 10.), new Aluno("Ana", 2., 10.)); 
			for (Aluno aluno : alunos) {
				System.out.println("Aluno: " + aluno.getNome() + ", Media: " + aluno.calcularMedia());
			}
			
		} catch (AlunoException e) {
			System.err.println(e.getMessage());
		}

	}

}
