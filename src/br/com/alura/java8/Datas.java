package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("Data de Hoje: " + hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		//Pegando Periodo entre 2 datas
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println("Faltam: " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para a Olímpiadas do Rio de Janeiro.");
		
		//Multiplicando por X anos
		LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximaOlimpiadas);
		
		//Formatador de Datas
		DateTimeFormatter dateFormatterDMYHM = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String proximaOlimpiadasFormatada = proximaOlimpiadas.format(dateFormatter);
		System.out.println("As próximas olímpiadas serão na data: " + proximaOlimpiadasFormatada);
	
		//Data de hoje formatada
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(dateFormatterDMYHM));
	
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		
		Period periodoExercicio = Period.between(hoje, data);
		
	}
}
