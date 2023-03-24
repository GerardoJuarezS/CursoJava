/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenacion;

/**
 *
 * @author Gerardo
 */
public class Concatenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var usuario = "Gerardo";
        var titulo = "ISC";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(1 + j);
        System.out.println(i + j + usuario); //realiza suma
        System.out.println(usuario +i +j); //contexto cadena, todo lo toma como cadena
        System.out.println(usuario + (i+j)); //uso de parentesis modifican la prioridad de operacion.
    }

}
