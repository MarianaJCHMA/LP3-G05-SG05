/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Gabo
 */
public class PruebaFigura {
    
    public static void main(String[] args) {
    
        Figura[] FigurasGeometricas = new Figura[6];
        int countBi = 0;
        int countTri = 0;

        FigurasGeometricas[0] = new Circulo( "Circulo", "Figura Bidimensional", 5);
        FigurasGeometricas[1] = new Cuadrado("Cuadrado", "Figura Bidimensional", 9);
        FigurasGeometricas[2] = new Triangulo("Triangulo", "Figura Bidimensional", 8, 9);
        FigurasGeometricas[3] = new Esfera("Esfera", "Figura Tridimensional", 12);
        FigurasGeometricas[4] = new Cubo("Cubo", "Figura Tridimensional", 25);
        FigurasGeometricas[5] = new Tetraedro("Tetraedro", "Figura Tridimensional", 18);

        System.out.println("Figuras Geometricas procesadas de forma Polimorfica: \n");

        for(Figura FigurasActuales : FigurasGeometricas) 
        {
            System.out.printf( FigurasActuales.toString());

            if(FigurasActuales instanceof FiguraBidimensional){
                countBi++;
            }

            if(FigurasActuales instanceof FiguraTridimiensional){
                countTri++;
            }
        }
        System.out.println("\nEn el arreglo de Figuras Geometricas hay: "+ countBi +" Figuras Geometricas Bidimensionales");
        System.out.println("En el arreglo de Figuras Geometricas hay: "+ countTri +" Figuras Geometricas Tridimensionales");
    }
}
