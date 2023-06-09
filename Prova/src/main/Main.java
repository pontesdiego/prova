package main;

import java.time.LocalDate;
import java.time.Month;

import funcionario.Advogado;
import funcionario.Medico;
import funcionario.Motoboy;
import funcionario.Setor;
import pessoa.Endereco;
import pessoa.UnidadeFederativa;
import pessoa.fisica.Genero;
import pessoa.juridica.Juridica;

public class Main {

	public static void main(String[] args) {
		
		Motoboy motoboy = new Motoboy("Diego", "(71) 98648586", "diego@gmail.com", new Endereco("Longe do senai", "Salvador", "987", "perto de periperi", "7859754768", UnidadeFederativa.BAHIA),
				LocalDate.of(2005, Month.APRIL, 30), Genero.MASCULINO, "959475", "84863325-09", "666", Setor.OPERACOES, 1250, "895456457");
		
		Medico medico = new Medico("Marcola", "(71) 98648586", "Marcola@gmail.com", new Endereco("Longe do senai", "Salvador", "987", "perto de periperi", "7859754768", UnidadeFederativa.RIO_DE_JANEIRO),
				LocalDate.of(2005, Month.APRIL, 30), Genero.FEMININO, "959475", "84863325-09", "666", Setor.SAUDE, 8000, "895456457");
		
		Advogado advogado = new Advogado("Lima", "(71) 98648586", "Lima@gmail.com", new Endereco("Perto do senai", "Belém", "987", "perto do juiz", "7859754768", UnidadeFederativa.SAO_PAULO),
				LocalDate.of(2005, Month.APRIL, 30), Genero.MASCULINO, "959475", "84863325-09", "354345", Setor.JURIDICO, 1600, "895456457");
		
		Juridica juridica = new Juridica("Lula", "(71) 9090666", "DiegoPontes30.04@gmail.com", new Endereco("Brasilia", "Salvador", "8792545", "Rua do pará", "949606554", UnidadeFederativa.RIO_DE_JANEIRO)
				, "849363565", "8458345346");
		
	System.out.println(motoboy);
		
	System.out.println("");
	
	System.out.println(medico);
	
	System.out.println("");
	
	System.out.println(advogado);
	
	System.out.println("");
	
	System.out.println(juridica);
	
	

	}

}
