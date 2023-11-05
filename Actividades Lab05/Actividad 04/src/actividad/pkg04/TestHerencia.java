/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg04;

/**
 *
 * @author Gabo
 */
public class TestHerencia {

    public static void main (String [] args){
        Asalariado emplead1 = new Asalariado("Manuel Cortina", 76139218, 28);
        EmpleadoProduccion emplead2 = new EmpleadoProduccion("Juan Mota", 55273892, 30, "noche");
        EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Antonio Camino", 75829931, 35, "Arequipa");

        System.out.println("DATOS DE LOS OBJETOS EMPLEADOS POR HERENCIA");
        System.out.println("\n");
        //Empleado 1 output-----
        System.out.println("El nombre del empleado 1 es " + emplead1.getNombre());
        System.out.println("El DNI del empleado 1 es " + emplead1.getDni());
        System.out.println("Los dia de vacaciones del empleado 1 es " + emplead1.getDiasVacaciones());
        System.out.println("\n");

        //Empleado 2 output-----
        System.out.println("El nombre del empleado 2 es " + emplead2.getNombre());
        System.out.println("El DNI del empleado 2 es " + emplead2.getDni());
        System.out.println("Los dia de vacaciones del empleado 2 es " + emplead2.getDiasVacaciones());
        System.out.println("El turno del empleado 2 es " + emplead2.getTurno());
        System.out.println("\n");

        //Empleado 3 output-----
        System.out.println("El nombre del emplead3 es " + emplead3.getNombre());
        System.out.println("El DNI del empleado 3 es " + emplead3.getDni());
        System.out.println("Los dia de vacaciones del empleado 3 es " + emplead3.getDiasVacaciones());
        System.out.println("La region del emplead 3 es " + emplead3.getRegion());
        System.out.println("\n");
    }
    
}