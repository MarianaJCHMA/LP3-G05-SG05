/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg04;

/**
 *
 * @author Gabo
 */
public class EmpleadoDistribucion extends Asalariado  {
    
    // -------------- atributos -------------------
    private String region;

     // -------------- Constructor -------------------
     public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region){
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }

    // -------------- gets y sets -------------------

    public String getRegion(){
        return this.region;
    }

    public void setRegion(String nuevo_region){
        this.region = nuevo_region;
    }
}