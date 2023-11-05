/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg02;

/**
 *
 * @author Gabo
 */
public class Motor {
     // -------------- atributos -------------------

    private int numMotor;
    private int revPorMin;

    // -------------- Constructor -------------------

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    // -------------- gets y sets -------------------

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = "Numero de motor: " +this.numMotor + "\n" +
        "R.V.P: " + this.revPorMin + "\n";
        return s;
    }
}
