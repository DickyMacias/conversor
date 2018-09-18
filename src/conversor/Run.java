/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author dicky
 */
public class Run {
    
    public void run(){
    
                Scanner scan = new Scanner(System.in);
        int opcionA; 
        double valor;
        System.out.println("Por favor selecciona tu operacion de las siguientes opciones numericas:\n"
                + "1. Temperatura\n"
                + "2. Moneda\n"
                + "3. Longitud\n"
                + "4. Superficie\n");
         opcionA = scan.nextInt();
         switch (opcionA){
             case 1:
                 Formulas t = new Temperatura();
                 System.out.println("Escogiste Temperatura:\n"
                         + "1. De Celsios a Farenheit\n"
                         + "2. De Farenheit a Celsios\n");
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
                 break;
             case 2:
                 Formulas m = new Moneda();
                 System.out.println("Escogiste Moneda:\n"
                         + "1. De Dolares a Pesos\n"
                         + "2. De Pesos a Dolares\n");
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
                 break;
             case 3:
                 Formulas l = new Longitud();
                 System.out.println("Escogiste Longitud:\n"
                         + "1. De Metros a Yardas\n"
                         + "2. De Yardas a Metros\n");
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
                 break;
             case 4:
                 Formulas s = new Superficie();
                 System.out.println("Escogiste Superficie:\n"
                         + "1. De Km2 a Millas cuadradas\n"
                         + "2. De Millas Cuadradas a Km2\n");
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
                 break;
             default:
                System.out.println("Dato no valido."); 
         }
    }
}
