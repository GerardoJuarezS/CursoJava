/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author Gerardo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Tipos primitivos enteros: byte, short, int, long
         */
        byte numeroByte = 12;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo del byte" + Byte.MIN_VALUE);
        System.out.println("valor maximo del byte" + Byte.MAX_VALUE);

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo del short" + Short.MIN_VALUE);
        System.out.println("valor maximo del short" + Short.MAX_VALUE);

        int numeroInt =  999999;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo del int" + Integer.MIN_VALUE);
        System.out.println("valor maximo del int" + Integer.MAX_VALUE);

        long numeroLong = 9;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo del long" + Long.MIN_VALUE);
        System.out.println("valor maximo del long" + Long.MAX_VALUE);

    }

}
