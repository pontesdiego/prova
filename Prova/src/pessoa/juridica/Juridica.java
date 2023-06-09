package pessoa.juridica;

import pessoa.Endereco;
import pessoa.Pessoa;

public class Juridica extends Pessoa{
	
	private String cnpj;
	private String inscricacaoEstadual;
	
	public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj,
			String inscricacaoEstadual) {
		super(nome, telefone, email, endereco);
		this.cnpj = cnpj;
		this.inscricacaoEstadual = inscricacaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricacaoEstadual() {
		return inscricacaoEstadual;
	}

	public void setInscricacaoEstadual(String inscricacaoEstadual) {
		this.inscricacaoEstadual = inscricacaoEstadual;
	}

	@Override
	public String toString() {
		return "\n Juridica:  " +
	            super.toString() +
				 "\n cnpj: " + cnpj +
				 "\n inscricacaoEstadual=" + inscricacaoEstadual ;
	}
	
	

}
