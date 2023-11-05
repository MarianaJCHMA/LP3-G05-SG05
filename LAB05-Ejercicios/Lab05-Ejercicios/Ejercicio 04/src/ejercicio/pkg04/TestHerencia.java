/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg04;

/**
 *
 * @author Gabo
 */
public class TestHerencia {
     public static void main (String [] args){
        Asalariado emplead1 = new Asalariado("Manuel Cortina", 76139218, 6000, 28);
        EmpleadoProduccion emplead2 = new EmpleadoProduccion("Juan Mota", 55273892, 4000, 30, "noche");
        EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Antonio Camino", 75829931, 1200, 35, "Arequipa");



        System.out.println(emplead1);

        emplead2.incrementosalarial();
        emplead3.incrementosalarial();

        System.out.println(emplead2);
        System.out.println(emplead3);

    }
    
}
