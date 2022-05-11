package calculadora;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {

    //Objeto calculadora utilizado por todos os testes.
    private Calculadora calculadora;

    @Before
    public void inicializacao() {
        //Instancia um objeto da classe Calculadora
        calculadora = new Calculadora(4.0, 2.0);
    }

    @Test
    public void testCalculadora() {
        Calculadora instancia = new Calculadora();
        assertTrue((instancia.getValorB()== 0.0)  && (instancia.getValorB() == 0.0));
    }
    
    @Test
    public void testGetAdicao() {
        double retornoEsperado = 6.0;
        //Chama a operacao getAdicao()
        double retornoFeito = calculadora.getAdicao();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetSubtracao() {
        double retornoEsperado = 2.0;
        //Chama a operacao getSubtracao()
        double retornoFeito = calculadora.getSubtracao();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetProduto() {
        double retornoEsperado = 8.0;
        //Chama a operacao getProduto()
        double retornoFeito = calculadora.getProduto();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetDivisao() {
        double retornoEsperado = 2.0;
        //Chama a operacao getDivisao()
        double retornoFeito = calculadora.getDivisao();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @After
    public void finalizacao() {
        calculadora = null;
    }
}
