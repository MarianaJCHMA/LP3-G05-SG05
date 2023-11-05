/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Gabo
 */
public class PruebaInterfazPorPagar {

    public static void main(String[] args) {

        Porpagar[] objetosPorPagar = new Porpagar[6];

        objetosPorPagar[0] = new Factura("01234", "Asiento",2,375.00);
        objetosPorPagar[1] = new Factura("56789", "Llanta",4,79.00);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(5, 286);
        objetosPorPagar[5] = new Prestamo(12, 750);

        System.out.println("Facturas, Empleados y Prestamos procesados en forma polimorfica: \n");

        for(Porpagar porPagarActual : objetosPorPagar) 
        {
            System.out.printf( porPagarActual.toString());
        }
    }
    
}