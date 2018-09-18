/*
Clase abstracta para a partir de ella heredar metodos abstractos
y valores a clases hijas.
 */
package conversor;

public abstract class Formulas {
    
    // Variables para valor entrante y para constante 
    public double valor;
    public double conversion;

    public Formulas() {
    }

    public Formulas(double valor, double conversion) {
        this.valor = valor;
        this.valor = conversion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
    
    public abstract void ab(double valor);
    
    public abstract void ba(double valor);
    
}
