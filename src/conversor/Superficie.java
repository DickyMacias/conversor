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
public class Superficie extends Formulas{
    
    public Superficie() {
    }

    public Superficie(double valor, double conversion) {
        super(valor, conversion);
        this.valor = valor;
        this.conversion = conversion;
    }
    
    
    @Override
    public void ab(double valor){
        
        conversion = 0.000386102;
        
        valor = valor * conversion;
        System.out.println(valor + " Millas Cuadradas");
        
    
    }
    
    
    @Override
    public void ba(double valor) {
    
        conversion = 0.000386102;
        
        valor = valor / conversion;
        System.out.println(valor + " Metros Cuadradas");
    
    }
    
}
