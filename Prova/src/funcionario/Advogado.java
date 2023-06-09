package funcionario;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.Genero;

public class Advogado extends Funcionario{
	
	private String oab;

	public Advogado(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento,
			Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String oab) {
		super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
		this.oab = oab;
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}

	@Override
	public String toString() {
		return "Advogado " +
				super.toString() 
				+ "\n oab: " + oab;
				
	}
	
	

}
