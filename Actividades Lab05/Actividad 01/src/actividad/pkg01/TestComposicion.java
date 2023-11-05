/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg01;

import java.util.*;

public class TestComposicion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creacion de objetos:
        Persona Gabriel = new Persona(445678, "Gabriel", "Huayapa");
        Cuenta cuenta1 = new Cuenta(447586, 300.0);

        // El objeto Joaquin que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Gabriel");
        System.out.println("\n");
        System.out.println("El nombre del principal de la cuenta es: " + Gabriel.getNombre());
        System.out.println("El Apellido del principal de la cuenta es: " + Gabriel.getApellido());
        System.out.println("El ID de la cuenta o numero de cuenta es: " + Gabriel.getId());
        System.out.println("El ID validado de la cuenta es: " + Gabriel.getCuenta().getNumero());
        System.out.println("El saldo inicial de la cuenta es: " + Gabriel.getCuenta().getSaldo());

        // Agregamos valor al saldo//
        System.out.println("El saldo de la cuenta es 0, ingrese un saldo: ");
        double saldo = sc.nextDouble();
        Gabriel.getCuenta().setSaldo(saldo);
        System.out.println("El nuevo saldo de la cuenta es: " + Gabriel.getCuenta().getSaldo());

        // ---------------------------------------------------------------------------------//
        // Creamos un objeto cuenta para ver como funciona el constructor//
        System.out.println("\n");
        System.out.println("DATOS DEL OBJETO cuenta1");
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getSaldo());
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getNumero());
    }

}