package pessoa.fisica;

import java.time.LocalDate;
import java.time.Period;

import pessoa.Endereco;
import pessoa.Pessoa;

public class Fisica extends Pessoa{
	
	protected LocalDate dataNascimento;
	protected Genero genero;
	
	public Fisica(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento,
			Genero genero) {
		super(nome, telefone, email, endereco);
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "" +
	           super.toString() +
			   "\n dataNascimento: " + dataNascimento +
			   "\n genero: " + genero.texto + "(" + genero.caractere + ")"  +
			   "\n idade: " + getIdade();
	}
	
	

}
