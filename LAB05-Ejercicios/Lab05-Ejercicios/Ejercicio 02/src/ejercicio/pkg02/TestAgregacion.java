/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg02;

/**
 *
 * @author Gabo
 */
public class TestAgregacion {
     public static void main(String[] args) {

        // creacion de objetos:
        Automovil R8 = new Automovil("V7M-238", 4, "Audi", "R-8-2022");
        Motor C8 = new Motor(12384, 1000);

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil \n");
        R8.setMotor(C8); //relacion de agregacion 

        // Mostrar //
        System.out.println(R8);

        // creacion de objetos
        Automovil GLB = new Automovil("RMY-674", 4, "Mercedes-Benz", "GLB-2022");

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil \n");
        
        // Mostrar //
        System.out.println(GLB);
    } 
}
