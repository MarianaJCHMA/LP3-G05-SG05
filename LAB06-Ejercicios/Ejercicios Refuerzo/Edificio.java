/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.refuerzo;

/**
 *
 * @author Gabo
 */
public class Edificio {

    // -------------- atributos -------------------

    public Elevador elevador;
    public int NumPisos;
    public int PisoActual = 0;


    // -------------- constructor -------------------

    public Edificio( int numPisos) {
        this.NumPisos = numPisos;
    }

    // -------------- gets y sets ------------------

    public int getNumPisos() {
        return this.NumPisos;
    }

    public void setNumPisos(int numPisos) {
        this.NumPisos = numPisos;
    }

    public Elevador getElevador() {
        return elevador;
    }

    public void setElevador(Elevador elevador) {
        this.elevador = elevador;
    }

    public int getPisoActual() {
        return this.PisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.PisoActual = pisoActual;
    }

    // -------------- método String -------------------
    @Override
    public String toString() {
        String s;
        s = "\n" +
        "--------------- Datos del Edificio y Elevador ---------------" + "\n" +
                "Numero de pisos del edificio: " + this.NumPisos;
        return s;
    }
}