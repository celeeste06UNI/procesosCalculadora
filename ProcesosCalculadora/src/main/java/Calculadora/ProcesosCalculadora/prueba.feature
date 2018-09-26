@featureTest
Feature: Ejemplo de uso de una calculadora
		que es capaz de sumar, restar, multiplicar y dividir.
@Scenario1 
Scenario: Suma de dos valores
    Given La calculadora está iniciada
    When Sumar los valores 6 y 2
    Then El resultado es 8
    
@Scenario2
Scenario: Resta de dos valores
	Given La calculadora está iniciada
	When Restar los valores 6 y 2
	Then El resultado es 4
	
@Scenario3
Scenario: Multiplicacion de dos valores
	Given La calculadora está iniciada
	When Multiplicar los valores 6 y 2
	Then El resultado es 12
	
@Scenario4
Scenario: Division de dos valores
	Given La calculadora está iniciada
	When Dividar los valores 6 y 2 
	Then El resultado es 3
	
	