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
public class Temperatura extends Formulas{
    

    public Temperatura() {
    }

    public Temperatura(double valor, double conversion) {
        super(valor, conversion);
        this.valor = valor;
        this.conversion = conversion;
    }
    
    
    @Override
    public void ab(double valor){
        
        conversion = 1.8;
        
        valor = (valor * conversion) + 32;
        System.out.println(valor + " Farenheit");
        
    
    }
    
    
    @Override
    public void ba(double valor) {
        
        conversion = 1.8;
        
        valor = (valor / conversion) - 32;
        System.out.println(valor + " Celsios");
    
    
    
    }
    

    
    
}
