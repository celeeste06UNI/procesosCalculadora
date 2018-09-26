package Calculadora.ProcesosCalculadora;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class annotation {

	private Calculadora calculadora = null;
	private int resultado;
	
	@Given("^La calculadora está iniciada$")
	public void la_calculadora_está_iniciada() throws Throwable {
	    calculadora = new Calculadora();
	}

	@When("^Sumar los valores (\\d+) y (\\d+)$")
	public void sumar_los_valores_y(int a, int b) throws Throwable {
	    resultado = calculadora.suma(a, b);
	}

	
	@When("^Restar los valores (\\d+) y (\\d+)$")
	public void restar_los_valores_y(int a, int b) throws Throwable {
	   resultado = calculadora.resta(a,  b);
	}

	@When("^Multiplicar los valores (\\d+) y (\\d+)$")
	public void multiplicar_los_valores_y(int a, int b) throws Throwable {
	     resultado = calculadora.multiplicacion(a, b);
	}

	@When("^Dividar los valores (\\d+) y (\\d+)$")
	public void dividar_los_valores_y(int a, int b) throws Throwable {
		 resultado = calculadora.division(a, b);
	}

	
	@Then("^El resultado es (\\d+)$")
	public void el_resultado_es(int esperado) throws Throwable {
	    Assert.assertEquals(esperado, resultado);
	}
}
