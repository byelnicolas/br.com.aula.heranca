package br.com.aula.heranca.model;

public class PessoaFisica extends Pessoa {

	private String CPF;

	// construtor
	public PessoaFisica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
	}
	// metodos de acesso

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
