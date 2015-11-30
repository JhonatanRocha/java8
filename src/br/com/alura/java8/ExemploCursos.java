package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 114));
		cursos.add(new Curso("C++", 55));
		
		//Ordenando por número de alunos utilizando Lambda
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		//Ordenando por número de alunos utilizando Method Reference
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Imprimindo a lista de Cursos
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Imprimindo a lista de cursos direto do Stream
		//Pois o stream não altera a collection cursos diretamente.
		//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
	
		//Imprimindo o total de Alunos de cada curso com mais de 100 alunos
		//cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(total -> System.out.println(total));

		//Fazendo a mesma função acima, porém utilizando method reference
		cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);
		
		int soma = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		System.out.println("Total de alunos por cursos com mais de 100 alunos: " + soma);
	
		//Stream de String que contém os nomes de todos os cursos.
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);
	}
}
