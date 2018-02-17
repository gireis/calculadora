package br.com.inmetrics.calculadora;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class CalculosTest { 
	
	Operacoes operacoes = new Operacoes();
	
	
	@Before
	public void header() {
	System.out.println("Calculadora Inmetrics");
	}

	
	@Test 
	public void calcular(){
		double a = 3.0;
		double b = 4.0;
		String valor = null;
		double resultado = operacoes.somar(a, b);
		
		
		System.out.println("Operação: " + a + " + " + b + " = " + resultado);
		
		Assert.assertNotNull(valor);
		
       }
	
	
	@After
	public void finalize() {
		System.out.println("Essa calculadora foi criada por especialistas!");
	}
	
	
	
	
}
