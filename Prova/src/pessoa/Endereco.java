package pessoa;

public class Endereco {
	
	protected String logadouro;
	protected String cidade;
	protected String numero;
	protected String complemento;
	protected String cep;
	protected UnidadeFederativa uf;
	
	public Endereco(String logadouro, String cidade, String numero, String complemento, String cep,
			UnidadeFederativa uf) {
		super();
		this.logadouro = logadouro;
		this.cidade = cidade;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.uf = uf;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco "
				+ "logadouro: " + logadouro + ", cidade: " + cidade + ", numero: " + numero + ", complemento: "
				+ complemento + ", cep: " + cep + ", Unidade Federativa: " + uf.texto + "(" + uf.sigla + ")" ;
	}

	
	

}
