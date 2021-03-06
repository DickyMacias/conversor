/*
Clase hija. Se extiende de Formulas. 
Hereda valores y metodos para ser sobreescritos.
 */
package conversor;

public class Longitud extends Formulas {
    
    public Longitud() {
    }

    // Se crea superconstructor con datos de la clase padre extendidos.
    public Longitud(double valor, double conversion) {
        super(valor, conversion);
        this.valor = valor;
        this.conversion = conversion;
    }
    
    // Se settea el value de la variable conversion y se recibe parametro desde
    // la consola por el scanner (Clase Run).
    // Metodo contiene la formula de conversion.
    @Override
    public void ab(double valor){
        conversion = .917;
        valor = valor * conversion;
        System.out.println(valor + " Yardas");    
    }
    
    @Override
    public void ba(double valor) {
        conversion = .917;
        valor = valor / conversion;
        System.out.println(valor + " Metros");
    }
}
