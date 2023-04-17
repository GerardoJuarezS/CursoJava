/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresrelacional;

/**
 *
 * @author Gerardo
 */
public class OperadoresRelacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b;//mayor  que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es un adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }
        

    }
    
}
