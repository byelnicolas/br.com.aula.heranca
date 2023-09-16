package br.com.aula.heranca.main;

import br.com.aula.heranca.model.CarroGasolina;

public class Main {
  public static void main(String[] args) {
	  CarroGasolina carroGasolina = new CarroGasolina();
	  carroGasolina.ligarCarro();
	  carroGasolina.acelerarCarro();
	  carroGasolina.setCor("roxo");
	  System.out.println(carroGasolina.toString());
	  
	  System.out.println(MultipliqueDoisValores(10,50));
	  
	  
  }
  // implemente um método que caucule 1 + 1
  public static int somaDOisValores(int PrimeiroNumero, int SegundoNumero) {
	  return PrimeiroNumero + SegundoNumero;
  }
  
//implemtente um metodo que multiplique dois valores 

  public static int MultipliqueDoisValores (int PrimeiroValor, int SegundoValor) {
	  
	  return PrimeiroValor * SegundoValor;
  }
}


