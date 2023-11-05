/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg03;

/**
 *
 * @author Gabo
 */
public class TestAsociacion {
     public static void main(String[] args) {

        //------ Creacion de objeto bcp ---------
        Banco bcp = new Banco("BCP");

        //------ Personas del bcp ---------
        Persona Fabian = new Persona(82397, "Fabian", "Mamani", 18000.0);
        Persona Dante = new Persona(21484, "Dante", "Quispe",10000.0);
        Persona Guerhalt = new Persona(25425, "Guerhalt", "Torres",3200);
        Persona Fernando = new Persona(73528, "Fernando", "Luigui",1250);
        Persona Mario = new Persona(938173, "Mario", "Vilca",7000);

        //------ métodos dentro del bcp ---------
        bcp.agregarCliente(Fabian);
        bcp.agregarCliente(Dante);
        bcp.agregarCliente(Guerhalt);
        bcp.agregarCliente(Fernando);
        bcp.agregarCliente(Mario);

        bcp.darBajaCliente(Dante);
        bcp.darBajaCliente(Fernando);

        bcp.buscarCliente(Fabian);
        bcp.buscarCliente(Mario);

        //------ imprimir datos del bcp ---------
        System.out.println(bcp);
    }
}
