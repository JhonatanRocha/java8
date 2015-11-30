package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("video aula");
		palavras.add("pc");
		palavras.add("java");

		// Utilizando a interface do Java 8 para ordenar.
		// Implementação através do Lambida
		/*palavras.sort((s1, s2) -> {
			if(s1.length() < s2.length())
				return -1;
			if(s1.length() > s2.length())
				return 1;
			else
				return 0;
		});*/
		
		
		//A mesma implementação acima porém mais enchuta
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Mesmo codigo acima porém utilizando outro método que fabrica a String e compara.
		palavras.sort(Comparator.comparing(palavra -> palavra.length()));
		
		//Sintaxe identica a de cima
		palavras.sort(Comparator.comparing(String::length));

		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		//
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		/*
		 * Ordenação Antiga de String da forma antiga.
		 * 
		 * Collections.sort(palavras, comparador);
		 */

		System.out.println(palavras);

		/*
		 * Forma Antiga de Iterar uma coleção de Strings.
		 * 
		 * for (String palavra : palavras) { System.out.println(palavra); }
		 */

		// Utilizando a interface do Java 8 para iterarção.
		// Implementação através do Lambida
		palavras.forEach(palavra -> System.out.println(palavra));
		
		//faz a mesma coisa que o código acima, utilizando method references.
		palavras.forEach(System.out::println);
		
		// Implementação através do Lambida de uma Thread
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
