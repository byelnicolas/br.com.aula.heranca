package br.com.aula.heranca.model;

public class PessoaJuridica extends Pessoa {

	private Long cnpj;

	// construtor
	public PessoaJuridica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, Long cnpj) {
		super(nome);
	}

	// metodos de acesso
	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

}
