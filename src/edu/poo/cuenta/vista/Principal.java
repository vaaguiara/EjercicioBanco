
package edu.poo.cuenta.vista;

import edu.poo.cuenta.modelo.Cuenta;


public class Principal {
    public static void main(String [] args)
    {
        Cuenta c1 = new Cuenta (1, 123 , "FG", 10);
        double saldo = c1.getSaldo();
        System.out.println ("Saldo " + saldo);
        
        int varClase = Cuenta.VariableDeClase;
        System.out.println(varClase);
        
        Cuenta.incrementarVariable();
        
        
    }
    
}
