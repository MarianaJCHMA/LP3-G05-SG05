/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Gabo
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    // -------------Constructor----------------------

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salarioSemanal) {
        super(nombre, apellido, nss);
        setSalarioSemanal(salarioSemanal);
    }

    // ----------------gets y sets ----------------------

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    // ------------- Metodo ToString -------------
    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Datos del empleado Asalariado ---------------" + "\n" +
				"Primer Nombre: " + this.primerNombre + "\n" +
				"Apellido Paterno: " + this.apellidoPaterno + "\n" +
				"Numero de seguro social: " + this.numeroSeguroSocial + "\n"+ 
                "Salario Semanal: " + this.salarioSemanal + "\n" +
                "Pago vencido: " + this.obtenerMontoPago() + "\n";
		return s;
	}

}