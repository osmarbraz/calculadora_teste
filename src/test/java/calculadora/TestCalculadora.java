package calculadora;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {
	private Calculadora calculadora;
	@Before
	public void inicializacao() {
		//Instancia um objeto da classe Calculadora
		calculadora = new Calculadora(4.0,2.0);
	}		
	@Test
	public void testGetSoma(){
		double retornoEsperado = 6.0;
		//Chama a operacao getSoma()
		double retornoFeito = calculadora.getSoma();
		//Premissa verifica se os valores s�o iguais
		assertEquals(retornoEsperado,retornoFeito,0);
	}	
	@Test
	public void testGetSubtracao(){
		double retornoEsperado = 2.0;
		//Chama a operacao getSubtracao()
		double retornoFeito = calculadora.getSubtracao();
		//Premissa verifica se os valores s�o iguais
		assertEquals(retornoEsperado,retornoFeito,0);
	}	
	@Test
	public void testGetProduto(){
		double retornoEsperado = 8.0;
		//Chama a operacao getProduto()
		double retornoFeito = calculadora.getProduto();
		//Premissa verifica se os valores s�o iguais
		assertEquals(retornoEsperado,retornoFeito,0);
	}	
	@Test
	public void testGetDivisao(){
		double retornoEsperado = 2.0;
		//Chama a operacao getDivisao()
		double retornoFeito = calculadora.getDivisao();
		//Premissa verifica se os valores s�o iguais
		assertEquals(retornoEsperado,retornoFeito,0);
	}
	@After
	public void finalizacao() {
		calculadora = null;
	}		
} 

