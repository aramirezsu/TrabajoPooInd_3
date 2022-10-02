/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_3;

import java.util.Scanner;

/**
 *
 * @author 57321
 */
public class PruebaMetodosFiguras {
    public static void creacion(Scanner sc) {
        double radio, lado, alturaT, alturaR, baseT, baseR,alturaTR,baseH,baseM,diagonalp,diagonals,ladoRom,diagonalD,diagonald;

        //System.out.println("CIRCULO");
        //System.out.print("Digite el valor del radio del circulo: ");
        //radio = sc.nextDouble();
        //Circulo circulo = new Circulo(radio);

        //System.out.println("RECTANGULO");
        //System.out.print("Digite el valor de la altura del rectangulo: ");
        //alturaR = sc.nextDouble();
        //System.out.print("Digite el valor de la base del rectangulo: ");
        //baseR = sc.nextDouble();
        //Rectangulo rectangulo = new Rectangulo(alturaR, baseR);

        //System.out.println("CUADRADO");
        //System.out.print("Digite el valor del lado del cuadrado: ");
        //lado = sc.nextDouble();
        //Cuadrado cuadrado = new Cuadrado(lado);

        //System.out.println("TRIANGULO");
        //System.out.print("Digite el valor de la altura del triangulo: ");
        //alturaT = sc.nextDouble();
        //System.out.print("Digite el valor de la base del triangulo: ");
        //baseT = sc.nextDouble();
        //Triangulo triangulo = new Triangulo(alturaT, baseT);
        
        //System.out.println("TRAPECIO");
        //System.out.print("Digite el valor de la altura del trapecio: ");
        //alturaTR = sc.nextDouble();
        //System.out.print("Digite el valor de la base menor del trapecio: ");
        //baseH = sc.nextDouble();
        //System.out.print("Digite el valor de la base mayor del trapecio: ");
        //baseM = sc.nextDouble();
        //System.out.print("Digite el valor de la primer diagonal del trapecio: ");
        //diagonalp = sc.nextDouble();
        //System.out.print("Digite el valor de la segunda diagonal del trapecio: ");
        //diagonals = sc.nextDouble();
        //Trapecio trapecio = new Trapecio(alturaTR, baseH,baseM,diagonalp,diagonals);
        
        //System.out.println("ROMBO");
        //System.out.print("Digite el valor de la diagonal mayor del rombo: ");
        //diagonald = sc.nextDouble();
        //System.out.print("Digite el valor de la diagonal menor del rombo: ");
        //diagonalD = sc.nextDouble();
        //System.out.print("Digite el valor del lado del rombo: ");
        //ladoRom = sc.nextDouble();
        //Rombo rombo = new Rombo(ladoRom, diagonald,diagonalD);

        //System.out.println("+-----------------+");
        //System.out.println("| RESUMEN FIGURAS |");
        //System.out.println("+-----------------+");
        
        //CIRCULO
        //System.out.println("El area del circulo es: " + circulo.calcularArea());
        //System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
        //System.out.println("");
        InterfazCirculo CCirculo = new InterfazCirculo();
        CCirculo.show(true);
        
        //RECTANGULO
        //System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        //System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        //System.out.println("");
        InterfazRectangulo RRectangulo = new InterfazRectangulo();
        RRectangulo.show(true);
        
        //System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        //System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
        //System.out.println("");
        InterfazCuadrado CCuadrado = new InterfazCuadrado();
        CCuadrado.show(true);
        
        //System.out.println("El area del triangulo es: " + triangulo.calcularArea());
        //System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
        //triangulo.determinarTipoTriangulo();
        //System.out.println("");
        InterfazTriangulo TRtriangulo = new InterfazTriangulo();
        TRtriangulo.show(true);
        
        //System.out.println("El area del trapecio es: " + trapecio.calcularArea());
        //System.out.println("El perimetro del trapecio es: " + trapecio.calcularPerimetro());
        //System.out.println("");
        InterfazTrapecio TRapecio = new InterfazTrapecio();
        TRapecio.show(true);
        
        //System.out.println("El area del rombo es: " + rombo.calcularArea());
        //System.out.println("El perimetro del rombo es: " + rombo.calcularPerimetro());
        //System.out.println("");
        InterfazRombo RRombo = new InterfazRombo();
        RRombo.show(true);
        

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        creacion(sc);
    }
    
}
