/*
Clase hija. Se extiende de Formulas. 
Hereda valores y metodos para ser sobreescritos.
 */
package conversor;

public class Moneda extends Formulas{

    public Moneda() {
    }

    // Se crea superconstructor con datos de la clase padre extendidos.
    public Moneda(double valor, double conversion) {
        super(valor, conversion);
        this.valor = valor;
        this.conversion = conversion;
    }
    
    // Se settea el value de la variable conversion y se recibe parametro desde
    // la consola por el scanner (Clase Run).
    // Metodo contiene la formula de conversion.
    @Override
    public void ab(double valor){
                
        conversion = 18;
        
        valor = valor * conversion;
        System.out.println(valor + " Pesos");
    
    }
    
    
    @Override
    public void ba(double valor) {
            
        conversion = 18;
        
        valor = valor / conversion;
        System.out.println(valor + " Dolares");
    }
    
    
    
    

    
}
