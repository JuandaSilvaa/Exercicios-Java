package enumeradores;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(123, PeriodoCurso.INTEGRAL);

		System.out.println("Curso: " + turma.getNumero());
		System.out.println("Dias: " + turma.getPeriodoCurso().getDias());
		System.out.println("Carga Horaria: " + turma.getPeriodoCurso().getCargaHoraria());
		System.out.println("Valor: " + turma.getPeriodoCurso().getValor());
		
	}

}
