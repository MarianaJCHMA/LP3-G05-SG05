/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg1;

/**
 *
 * @author Gabo
 */
import java.util.Scanner;

public class App {

    public static int cociente(int numerador, int denomidador) {
        return numerador / denomidador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir un numerador entero: ");
        int num = sc.nextInt();

        System.out.print("Introducir un denomidador entero: ");
        int dem = sc.nextInt();

        int res = cociente(num, dem);
        System.out.printf("\nResultado: %d / %d = %d\n", num, dem, res);
    }
}
