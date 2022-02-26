package br.com.caelum.livraria.dominio;

public class Cliente {

	private final String id;
	private final String cep;
	private final String ddd;
	private final String numero;
	
	public Cliente(String id, String cep, String ddd, String numero) {
		super();
		this.id = id;
		this.cep = cep;
		this.ddd = ddd;
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj instanceof Cliente) {
			Cliente outra = (Cliente) obj;
			iguais = id.equals(outra.id);
		}
		return iguais;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public String getTelefoneFormatado() {
		return String.format("(%s) %s", ddd, numero); 
	}
	
	public String getTelefone() {
		return getTelefoneFormatado();
	}
	
	public String getCep() {
		return cep;
	}
	
}
