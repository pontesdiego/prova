package pessoa;

public enum UnidadeFederativa {

	BAHIA("Bahia", "BA"),
	SAO_PAULO("S�o Paulo", "SP"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
	
	protected final String texto;
	protected final String sigla;
	
	private UnidadeFederativa(String texto, String sigla) {
		this.texto = texto;
		this.sigla = sigla;
	}

	public String getTexto() {
		return texto;
	}

	public String getSigla() {
		return sigla;
	}
	
	
	
	
}
