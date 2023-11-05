/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg04;

/**
 *
 * @author Gabo
 */
public class EmpleadoProduccion extends Asalariado {

    // -------------- atributos -------------------
    private String turno;

    // -------------- Constructor -------------------
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno){
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }

    // -------------- gets y sets -------------------

    public String getTurno(){
        return this.turno;
    }

    public void setTurno(String nuevo_turno){
        this.turno = nuevo_turno;
    }

    
}