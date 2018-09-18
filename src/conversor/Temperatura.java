/*
Clase hija. Se extiende de Formulas. 
Hereda valores y metodos para ser sobreescritos.
 */
package conversor;

public class Temperatura extends Formulas{
    
    public Temperatura() {
    }

    // Se crea superconstructor con datos de la clase padre extendidos.
    public Temperatura(double valor, double conversion) {
        super(valor, conversion);
        this.valor = valor;
        this.conversion = conversion;
    }
    
    // Se settea el value de la variable conversion y se recibe parametro desde
    // la consola por el scanner (Clase Run).
    // Metodo contiene la formula de conversion.
    @Override
    public void ab(double valor){   
        conversion = 1.8;
        valor = (valor * conversion) + 32;
        System.out.println(valor + " Farenheit");
    }
    
    @Override
    public void ba(double valor) {    
        conversion = 1.8;
        valor = (valor - 32) / conversion;
        System.out.println(valor + " Celsios");
    }
}
