/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perro;

/**
 *
 * @author Mariana
 */
public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso;
    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
