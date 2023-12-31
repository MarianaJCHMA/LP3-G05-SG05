/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg02;

public class Automovil {

    // -------------- atributos -------------------

    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    // -------------- Constructor -------------------

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    // -------------- gets y sets -------------------

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setPlaca(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s %10s%2s %10s%2s", this.placa, "|", this.numPuertas,"|", this.marca, "|", this.modelo);
        return s;
    }
}