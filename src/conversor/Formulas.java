/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author dicky
 */
public abstract class Formulas {
    
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
