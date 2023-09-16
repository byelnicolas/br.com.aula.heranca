package br.com.aula.heranca.model;

public class Pessoa {
	
	private String name;
	
	//construtor
	public Pessoa(String nome) {
		this.name = nome;
	}
   //métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
     
	
}
