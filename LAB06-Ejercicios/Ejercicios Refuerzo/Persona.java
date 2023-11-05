/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.refuerzo;

/**
 *
 * @author Gabo
 */
public class Persona {
    
    public String nombre;
    public double Peso;
    public double Pesocompleto = 0;

    public Persona( String nombre, double peso){
        this.nombre = nombre;
        this.Peso = peso;
    }

    //--------------- gets y sets ------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getPesocompleto() {
        return Pesocompleto;
    }

    public void setPesocompleto(double pesoTotal) {
        Pesocompleto = pesoTotal;
    }


    //--------------- metodos ------------------

    public double Pesototal(Persona[] listaPersonas) {
        for (int i = 0; i < listaPersonas.length; i++) {
            Pesocompleto = Pesocompleto+ listaPersonas[i].getPeso();
        }
        return Pesocompleto;
    }

    public int mostrarpersonas(Persona[] listaPersonas) {
        return listaPersonas.length;
    }

}