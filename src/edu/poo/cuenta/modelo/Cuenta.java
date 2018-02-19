
package edu.poo.cuenta.modelo;


public class Cuenta {
    private int numero;//variables de instancia si no tienen estatic 
    private int clave;
    private String duennio;
    private double saldo;
    public static int VariableDeClase = 10;//Variables de clase static

    public Cuenta(int numero, int clave, String duennio, double saldo) { //alt insert constructor
        this.numero = numero; 
        this.clave = clave;
        this.duennio = duennio;
        this.saldo = saldo;
    }

    public int getNumero() {//alt insert get
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDuennio() {
        return duennio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {  //alt instert set
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDuennio(String duennio) {
        this.duennio = duennio;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static void incrementarVariable()//Metodo de clase
    {//Sirve para cambiar el valor de la variable de clase VariableDeClase
        VariableDeClase++;
    }
    
}
