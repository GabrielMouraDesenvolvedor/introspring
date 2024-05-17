package br.com.aula.model;

public class Torcedor {
	private String nome;
	private String torcedor;
	
	public Torcedor() {};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTorcedor() {
		return torcedor;
	}
	public void setTorcedor(String torcedor) {
		this.torcedor = torcedor;
	}
	public Torcedor(String nome, String torcedor) {
		super();
		this.nome = nome;
		this.torcedor = torcedor;
	}
	
}
