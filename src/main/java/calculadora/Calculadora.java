package calculadora;

/**
 * Classe que simular uma calculadora.
 * 
 * Realiza operações matemáticas com 2 números reais.
 * @author osmar
 */
public class Calculadora {

    private double valorA;
    private double valorB;

    /**
     * Construtor sem argumento.
     */
    public Calculadora() {
        this(0.0, 0.0);
    }

    /**
     * Construtor com argumento.
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     */
    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    /**
     * Realiza a adição.
     * @return Um valor real.
     */
    public double getSoma() {
        return (getValorA() + getValorB());
    }

    /**
     * Realiza a subtração
     * @return Um valor real.
     */
    public double getDiferenca() {
        return (getValorA() - getValorB());
    }

    /**
     * Realiza o multiplicação.
     * @return Um valor real.
     */
    public double getProduto() {
        return (getValorA() * getValorB());
    }

    /**
     * Realiza a divisão.
     * @return Um valor real.
     */
    public double getQuociente() {
        return (getValorA() / getValorB());
    }
}
