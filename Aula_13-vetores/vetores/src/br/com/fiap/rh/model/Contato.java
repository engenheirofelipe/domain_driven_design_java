package br.com.fiap.rh.model;

public class Contato {
	
	private String tipoContato;
	
	private String descricaoContato;
	

	public Contato(String tipoContato, String descricaoContato) {
		super();
		this.tipoContato = tipoContato;
		this.descricaoContato = descricaoContato;
	}

	public String getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}

	public String getDescricaoContato() {
		return descricaoContato;
	}

	public void setDescricaoContato(String descricaoContato) {
		this.descricaoContato = descricaoContato;
	}
	

}
