/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etiquetasjava;

/**
 *
 * @author Gerardo
 */
public class EtiquetasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        inicio:
        for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue inicio;//ir a la linea de codigo de la etiqueta
            }   
            System.out.println("contador = " + contador);
        }
        
//        for( var contador = 0 ; contador < 3 ; contador++ ){
//            if( contador % 2 == 0){
//                System.out.println("contador = " + contador);
//                break;
//            }   
//        }
        
//        var contador = 0;
//        while( contador < 3 ){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while( contador < 3);
    }
    
}
