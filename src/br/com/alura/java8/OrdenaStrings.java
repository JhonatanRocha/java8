package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("video aula");
		palavras.add("pc");
		palavras.add("java");

		// Utilizando a interface do Java 8 para ordenar.
		// Implementa��o atrav�s do Lambida
		/*palavras.sort((s1, s2) -> {
			if(s1.length() < s2.length())
				return -1;
			if(s1.length() > s2.length())
				return 1;
			else
				return 0;
		});*/
		
		
		//A mesma implementa��o acima por�m mais enchuta
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		

		/*
		 * Ordena��o Antiga de String da forma antiga.
		 * 
		 * Collections.sort(palavras, comparador);
		 */

		System.out.println(palavras);

		/*
		 * Forma Antiga de Iterar uma cole��o de Strings.
		 * 
		 * for (String palavra : palavras) { System.out.println(palavra); }
		 */

		// Utilizando a interface do Java 8 para iterar��o.
		// Implementa��o atrav�s do Lambida
		palavras.forEach(palavra -> System.out.println(palavra));
		
		// Implementa��o atrav�s do Lambida de uma Thread
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
