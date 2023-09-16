package br.com.aula.heranca.model;

public class CarroGasolina extends Carro implements InterfaceCarroAGasolina {

	Integer combustivel = 0;


	public Integer getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Integer combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public void abastecer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colocarCombustivel() {
		// TODO Auto-generated method stub
		
	}

}
