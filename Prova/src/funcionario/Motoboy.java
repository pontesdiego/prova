package funcionario;

import java.time.LocalDate;

import pessoa.Endereco;
import pessoa.fisica.Genero;

public class Motoboy extends Funcionario{
	
	private String cnh;

	public Motoboy(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento,
			Genero genero, String cpf, String rg, String matricula, Setor setor, double salario, String cnh) {
		super(nome, telefone, email, endereco, dataNascimento, genero, cpf, rg, matricula, setor, salario);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Motoboy " +
	            super.toString() 
				+ "\n cnh: " + cnh ;
				
	}
	
	

}
