/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Gabo
 */
public abstract class Empleado implements Porpagar {

	public String primerNombre;
	public  String apellidoPaterno;
	public  String numeroSeguroSocial;

	// -------------Constructor----------------------

	public Empleado(String nombre, String apellido, String nss) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;

	}

	// ----------------gets y sets ----------------------

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}

	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

}
