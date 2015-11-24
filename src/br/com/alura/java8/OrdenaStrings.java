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
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.add("video aula");
		palavras.add("pc");
		palavras.add("java");
		
		//Utilizando a interface do Java 8 para ordenar.
		palavras.sort(comparador);
		
		/*
		 * Ordenação Antiga de String da forma antiga.
		 * 
		Collections.sort(palavras, comparador);
		*/
		
		System.out.println(palavras);
	
		/*
		 * Forma Antiga de Iterar uma coleção de Strings.
		 * 
		 * for (String palavra : palavras) {
			System.out.println(palavra);
		   }
		*/
		
		//Utilizando a interface do Java 8 para iterarção.
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
}
