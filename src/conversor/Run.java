/*
Esta clase contiene la vista del programa.
Aqui se corren las actividades una vez que se ejecuta en el main.
*/
package conversor;
import java.util.Scanner;

public class Run {
    
    public void run(){
    
        // Se instancia escaner y se crean las variables para los parametros.
        int opcionA; 
        double valor;
        Scanner scan = new Scanner(System.in);

        // Se hace el menu de opciones y se recibe en variable desde scanner.
        System.out.println("Por favor selecciona tu operacion de las siguientes opciones numericas:\n"
                + "1. Temperatura\n"
                + "2. Moneda\n"
                + "3. Longitud\n"
                + "4. Superficie\n");
        try {
            opcionA = scan.nextInt();     
     
        // En case se instancia con polimorfismo la clase segun su opcion.
        // Se inserta variable como parametro para entrar a submenu.
        // Se llama funcion y se pasa parametro valor para regresar resultado.
        // Se crea un try-catch para validar informacion ingresada 
            switch (opcionA){
                case 1:
                    Formulas t = new Temperatura();
                    System.out.println("Escogiste Temperatura:\n"
                            + "1. De Celsios a Farenheit\n"
                            + "2. De Farenheit a Celsios\n");
                                try {
                                    opcionA = scan.nextInt();
                                    switch (opcionA){
                                        case 1:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            t.ab(valor);
                                            break;
                                        case 2:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            t.ba(valor);
                                            break;
                                        default:
                                            System.out.println("Dato no valido.");
                                    }
                                }catch (Exception e) {
                                    System.err.println("No puedes introducir valores diferentes a los estipulados");
                                }
                    break;
                case 2:
                    Formulas m = new Moneda();
                    System.out.println("Escogiste Moneda:\n"
                            + "1. De Dolares a Pesos\n"
                            + "2. De Pesos a Dolares\n");
                                try {
                                    opcionA = scan.nextInt();
                                    switch (opcionA){
                                        case 1:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            m.ab(valor);
                                            break;
                                        case 2:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            m.ba(valor);
                                            break;
                                        default:
                                            System.out.println("Dato no valido.");
                                    }
                                }catch (Exception e) {
                                    System.err.println("No puedes introducir valores diferentes a los estipulados");
                                }
                    break;
                case 3:
                    Formulas l = new Longitud();
                    System.out.println("Escogiste Longitud:\n"
                            + "1. De Metros a Yardas\n"
                            + "2. De Yardas a Metros\n");
                                try{
                                    opcionA = scan.nextInt();
                                    switch (opcionA){
                                        case 1:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            l.ab(valor);
                                            break;
                                        case 2:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            l.ba(valor);
                                            break;
                                        default:
                                            System.out.println("Dato no valido.");
                                    }
                                }catch (Exception e) {
                                    System.err.println("No puedes introducir valores diferentes a los estipulados");
                                }
                    break;
                case 4:
                    Formulas s = new Superficie();
                    System.out.println("Escogiste Superficie:\n"
                            + "1. De Km2 a Millas cuadradas\n"
                            + "2. De Millas Cuadradas a Km2\n");
                                try{
                                    opcionA = scan.nextInt();
                                    switch (opcionA){
                                        case 1:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            s.ab(valor);
                                            break;
                                        case 2:
                                            System.out.println("Ingresa valor: ");
                                            valor = scan.nextDouble();
                                            s.ba(valor);
                                            break;
                                        default:
                                            System.out.println("Dato no valido.");
                                    }
                                }catch (Exception e) {
                                    System.err.println("No puedes introducir valores diferentes a los estipulados");
                                }
                    break;
                default:
                   System.out.println("Dato no valido."); 
            }
        } catch (Exception e) {
            System.err.println("No puedes introducir valores diferentes a los estipulados");
        }
    }
}
