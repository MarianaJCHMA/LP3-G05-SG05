/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg01;

public class Cuenta {

    // -------------- atributos -------------------
    private int numero;
    private double saldo;

    // -------------- Constructor -------------------

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(int numero) {
        this(numero, 0);
    }

    // -------------- gets y sets -------------------

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s", this.numero, "|", this.saldo );
        return s;
    }

}