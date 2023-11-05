/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg02;

/**
 *
 * @author Gabo
 */
public class PruebaEcologica {

    public static void main(String[] args) {

        ImpactoEcologico[] ObjetosImpacto = new ImpactoEcologico[3];

        ObjetosImpacto[0] = new Auto("Automovil", 200, 50, 26.4979);
        ObjetosImpacto[1] = new Edificio("Edificio", 30, 70, 35);
        ObjetosImpacto[2] = new Bicicleta("Biclicleta", 0, 20, 100);

        System.out.println("Objetos junto a su impacto Ambiental procesados de forma Polimorfica: \n");

        for(ImpactoEcologico ObjetosActuales : ObjetosImpacto) 
        {
            System.out.printf( ObjetosActuales.toString());
        }
    }    
}